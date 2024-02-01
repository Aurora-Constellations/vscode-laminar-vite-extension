package components.table

import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.FocusEvent

// TODO refactor input toggling
case class TableCell(content: String) extends AuroraElement {

    def handleCellClick(event: MouseEvent): Unit = {
        dom.document
            .getElementsByClassName("selectedCell")
            .map(element => element.classList.remove("selectedCell"))
        dom.document
            .getElementsByClassName("selectedRow")
            .map(element => element.classList.remove("selectedRow"))
        event.target.asInstanceOf[HTMLTableCellElement].className =
            "selectedCell"
        event.target
            .asInstanceOf[HTMLTableCellElement]
            .parentElement
            .className = "selectedRow"
    }

    def handleCellDblClick(event: MouseEvent): Unit = {
        val clickedCell = event.currentTarget.asInstanceOf[dom.html.TableCell]
        val originalValue = clickedCell.innerText
        clickedCell.innerHTML = "<input id='cell-input'/>"
        clickedCell.children.map(child =>
            val input = child.asInstanceOf[dom.html.Input]
            input.style.width = "90%"
            input.value = originalValue
            input.onkeydown = (event: KeyboardEvent) => {
                event.key match {
                    case "Enter" => {
                        clickedCell.innerHTML = ""
                        clickedCell.innerText = event.currentTarget
                            .asInstanceOf[dom.html.Input]
                            .value
                    }
                    case "Escape" => {
                        clickedCell.innerHTML = ""
                        clickedCell.innerText = originalValue
                    }
                    case _ =>
                }
            }
            input.onblur = (event: FocusEvent) => {
                clickedCell.innerText = originalValue
            }
            input.focus()
        )
    }

    def render(): Element = {
        td(
          content,
          onClick --> handleCellClick,
          onDblClick --> handleCellDblClick
        )
    }

}
