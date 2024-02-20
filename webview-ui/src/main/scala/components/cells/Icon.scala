package components.cells

import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.FocusEvent
import components.utils.DomUtils.removeClassnameFromAll
import components.utils.DomUtils.addClassnameToElement

import types.Patient
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import com.raquo.laminar.nodes.ReactiveHtmlElement
import cats.instances.boolean
import client.AuroraClient
import components.utils.Icons._

case class Icon(
    content: String,
    model: AuroraClient,
    fieldName: String,
    item: Patient
) extends AuroraElement {

    val flagId = Var(content)
    val cellContent = Var(content)

    // def renderInput(content: String) = {
    //     input(
    //       idAttr := "toggledInput",
    //       value := content,
    //       width := "90%",
    //       onKeyDown
    //           .filter(_.key == "Enter")
    //           .flatMap(e =>
    //               cellContent.set(
    //                 e.target.asInstanceOf[dom.html.Input].value
    //               )
    //               showInputVar.update(bool => !bool)
    //               model.updateEntryInDataModelVar(
    //                 item,
    //                 fieldName,
    //                 e.target.asInstanceOf[dom.html.Input].value
    //               )
    //           ) --> { resp => println(resp) },
    //       onKeyUp --> (e => {
    //           e.key match {
    //               case "Escape" => showInputVar.update(bool => !bool)
    //               case _        =>
    //           }
    //       }),
    //       onBlur --> (e => showInputVar.update(bool => !bool))
    //     )
    // }

    def ShowIcon(
        iconId: Signal[String]
    ): Signal[HtmlElement] = {
        iconId.map {
            case "1" => {
                val cell = div(flagGreen)
                cell.ref.innerHTML = flagGreen
                cell
            }
            case "2" => {
                val cell = div(flagYellow)
                cell.ref.innerHTML = flagGreen
                cell
            }
            case "3" => {
                val cell = div(flagRed)
                cell.ref.innerHTML = flagGreen
                cell
            }
            case "4" => {
                val cell = div(flagBlue)
                cell.ref.innerHTML = flagGreen
                cell
            }
            case _ => div()
        }
    }

    def render() = {
        td(
          child <-- ShowIcon(flagId.signal),
          tabIndex := 0,
          onClick --> (e => e.target.asInstanceOf[HTMLElement].focus())
          //   onDblClick --> (e =>
          //   flagId.update(bool => !bool)
          //   Option(dom.document.getElementById("toggledInput"))
          //       .map(_.asInstanceOf[HTMLElement].focus())
          //   )
        )
    }

}
