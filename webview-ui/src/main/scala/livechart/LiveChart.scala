package livechart

import scala.scalajs.js
import scala.scalajs.js.annotation.*

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}

import org.scalajs.dom.HTMLTableElement
import org.scalajs.dom.HTMLTableRowElement
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.html
import org.scalajs.dom.HTMLBodyElement
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import components.table.Table
import models.Model
import components.toolbar.Toolbar
import org.scalajs.dom.HTMLInputElement

import com.raquo.airstream.web.AjaxStream
import com.raquo.airstream.web.AjaxStream.AjaxStreamError

import io.circe._
import io.circe.parser._
import types.Patient
import scala.scalajs.js.JSON
// import utilities.JsonImplicits._

case class AjaxOption(name: String, url: String)
val options = List(
  AjaxOption(
    "Valid Ajax request",
    "http://192.168.250.125:9000/patients"
  ),
  AjaxOption(
    "Download 100MB file (gives you time to abort)",
    "https://cachefly.cachefly.net/100mb.test"
  ),
  AjaxOption(
    "URL that will fail due to invalid domain",
    "https://api.zippopotam.uxx/us/90210"
  ),
  AjaxOption(
    "URL that will fail due to CORS restriction",
    "https://unsplash.com/photos/KDYcgCEoFcY/download?force=true"
  )
)
val selectedOptionVar = Var(options.head)
val pendingRequestVar = Var[Option[dom.XMLHttpRequest]](None)
val eventsVar = Var(List.empty[String])

val AjaxTester: HtmlElement = div(
  h1("Ajax Tester"),
  options.map { option =>
      div(
        input(
          typ("radio"),
          idAttr(option.name),
          nameAttr("ajaxOption"),
          checked <-- selectedOptionVar.signal.map(_ == option),
          onChange.mapTo(option) --> selectedOptionVar
        ),
        label(forId(option.name), " " + option.name)
      )
  },
  br(),
  div(
    button(
      "Send",
      inContext { thisNode =>
          val clickStream =
              thisNode.events(onClick).sample(selectedOptionVar.signal)
          val responseStream = clickStream.flatMap { opt =>
              AjaxStream
                  .get(
                    url = opt.url,
                    // These observers are optional, we're just using them for demo
                    requestObserver = pendingRequestVar.someWriter,
                    progressObserver = eventsVar.updater { (evs, p) =>
                        val ev = p._2
                        evs :+ s"Progress: ${ev.loaded} / ${ev.total} (lengthComputable = ${ev.lengthComputable})"
                    },
                    readyStateChangeObserver = eventsVar.updater { (evs, req) =>
                        evs :+ s"Ready state: ${req.readyState}"
                    }
                  )
                  .map(resp => {
                      val patientJson = JSON
                          .parse(resp.responseText)
                          .asInstanceOf[js.Array[Patient]]

                      patientJson.map(patient => println(patient.firstName))
                      patientJson(0).firstName
                  })
                  .recover { case err: AjaxStreamError => Some(err.getMessage) }
          }

          List(
            clickStream.map(opt =>
                List(s"Starting: GET ${opt.url}")
            ) --> eventsVar,
            responseStream --> eventsVar.updater[String](_ :+ _)
          )
      }
    ),
    " ",
    button(
      "Abort",
      onClick --> (_ => pendingRequestVar.now().foreach(_.abort()))
    )
  ),
  div(
    h2("Events:"),
    div(children <-- eventsVar.signal.map(_.map(div(_))))
  )
)

@main
def LiveChart(): Unit = {

    // Get data model
    val model = new Model

    renderOnDomContentLoaded(
      dom.document.body,
      div(
        width := "100%",
        // AjaxTester,
        Toolbar(model.searchByOption, model.showOptions).render(),
        Table(model).render()
      )
    )
    addEventListeners()
}
end LiveChart
