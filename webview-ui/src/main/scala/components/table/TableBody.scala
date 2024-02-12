package components.table

import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}

import types.Patient
import scala.scalajs.js.JSON
import scala.scalajs.js
import io.circe.parser._
import io.circe.generic.auto._
import utilities.JsonImplicits._
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLTableRowElement

case class TableBody[T](
    dataUrl: String,
    dataVar: Var[List[T]],
    dataSignal: StrictSignal[List[T]],
    jsonDecoder: (jsonString: String) => List[T],
    getAsTableRow: (
        item: T
    ) => ReactiveHtmlElement[HTMLTableRowElement]
) extends AuroraElement {

    def render(): Element = {

        tbody(
          // Fetch the data on component mount, update table
          FetchStream.get(dataUrl, _.headers(("Authorization", ""))) --> {
              responseText =>
                  jsonDecoder(responseText)
                      .map(item => dataVar.update(_ :+ item))
          },
          idAttr := "myTableBody",
          children <-- dataSignal.map(data =>
              data.map { item =>
                  getAsTableRow(item)
              }
          )
        )
    }

}
