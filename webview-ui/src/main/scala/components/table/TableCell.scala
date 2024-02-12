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
// import models.dbUtils.update

//   val patient = items
//       .find(_.asInstanceOf[Patient].unitNumber == "TB00000000")
//       .get
//       .asInstanceOf[Patient]
//   val updatedPatient = patient
//   updatedPatient.firstName = "Did this change?"
//   items.updated(
//     items.indexOf(patient),
//     updatedPatient.asInstanceOf[T]
//   )

def toggleInput[T](cell: HTMLTableCellElement, data: Var[List[T]]): Unit = {
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
                    val row = cell.parentElement.asInstanceOf[dom.html.TableRow]
                    // update(row, data)
                    // val updatedPatient = data.filter(patient => patient._1 == row.)
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

case class TableCell[T](content: String, dataVar: Var[List[T]])
    extends AuroraElement {

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
              toggleInput[T](
                e.currentTarget.asInstanceOf[HTMLTableCellElement],
                dataVar
              )
          }
        )
    }

}
