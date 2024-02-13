package components.table

import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.FocusEvent
import components.utils.DomUtils.removeClassnameFromAll
import components.utils.DomUtils.addClassnameToElement
import model.AuroraDataModel
import types.Patient
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import com.raquo.laminar.nodes.ReactiveHtmlElement
import cats.instances.boolean

case class TableCell[T](
    content: String,
    model: AuroraDataModel,
    fieldName: String,
    item: Patient
) extends AuroraElement {

    val showInputVar = Var(false)
    val cellContent = Var(content)

    def renderInput(content: String) = {
        input(
          idAttr := "toggledInput",
          value := content,
          width := "90%",
          onKeyDown
              .filter(_.key == "Enter")
              .flatMap(e =>
                  cellContent.set(
                    e.target.asInstanceOf[dom.html.Input].value
                  )
                  showInputVar.update(bool => !bool)
                  model.updateEntryInDataModelVar(
                    item,
                    fieldName,
                    e.target.asInstanceOf[dom.html.Input].value
                  )
              ) --> { resp => println(resp) },
          onKeyUp --> (e => {
              e.key match {
                  case "Escape" => showInputVar.update(bool => !bool)
                  case _        =>
              }
          }),
          onBlur --> (e => showInputVar.update(bool => !bool))
        )
    }

    def ToggleableInput(
        showInput: Signal[Boolean]
    ): Signal[HtmlElement] = {
        showInput.map {
            case true  => renderInput(content)
            case false => div(child.text <-- cellContent)
        }
    }

    def handleCellClick(event: MouseEvent): Unit = {

        removeClassnameFromAll("selectedCell")
        removeClassnameFromAll("selectedRow")

        event.target match {
            // Handles clicks on empty cells
            case elem: HTMLTableCellElement => {
                addClassnameToElement(
                  "selectedCell",
                  elem
                )
                addClassnameToElement(
                  "selectedRow",
                  elem.parentElement
                )
            }
            // Handles clicks on cells with divs and inputs
            case _ => {
                addClassnameToElement(
                  "selectedCell",
                  event.target.asInstanceOf[HTMLElement].parentElement
                )
                addClassnameToElement(
                  "selectedRow",
                  event.target
                      .asInstanceOf[HTMLElement]
                      .parentElement
                      .parentElement
                )
            }

        }

    }

    def render() = {
        td(
          child <-- ToggleableInput(showInputVar.signal),
          tabIndex := 0,
          onClick --> handleCellClick,
          onDblClick --> (e =>
              showInputVar.update(bool => !bool)
              Option(dom.document.getElementById("toggledInput"))
                  .map(_.asInstanceOf[HTMLElement].focus())
          )
        )
    }

}
