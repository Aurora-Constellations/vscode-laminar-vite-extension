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

def toggleInput(cell: HTMLTableCellElement): Unit = {
    val originalValue = cell.innerText
    cell.innerHTML = "<input id='cell-input'/>"
    cell.children.map(child =>
        val input = child.asInstanceOf[dom.html.Input]
        input.style.width = "90%"
        input.value = originalValue
        input.onkeydown = (e: KeyboardEvent) => {
            e.key match {
                case "Enter" => {
                    cell.innerHTML = ""
                    cell.innerText = e.currentTarget
                        .asInstanceOf[dom.html.Input]
                        .value

                }
                case "Escape" => {
                    cell.innerHTML = ""
                    cell.innerText = originalValue
                }
                case _ =>
            }
        }
        input.onblur = (event: FocusEvent) => {
            cell.innerText = originalValue
        }
        input.focus()
    )
}

case class TableCell(content: String) extends AuroraElement {

    def handleCellClick(event: MouseEvent): Unit = {
        removeClassnameFromAll("selectedCell")
        removeClassnameFromAll("selectedRow")
        addClassnameToElement(
          "selectedCell",
          event.target.asInstanceOf[HTMLTableCellElement]
        )
        addClassnameToElement(
          "selectedRow",
          event.target.asInstanceOf[HTMLTableCellElement].parentElement
        )
    }

    def render(): Element = {
        td(
          content,
          onClick --> handleCellClick,
          onDblClick --> { (e) =>
              toggleInput(e.currentTarget.asInstanceOf[HTMLTableCellElement])
          }
        )
    }

}
