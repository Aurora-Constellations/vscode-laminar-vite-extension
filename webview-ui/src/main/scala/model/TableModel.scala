package models

import com.raquo.laminar.api.L.{*, given} 
import com.raquo.airstream.state.Var
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom
import org.scalajs.dom.MouseEvent

import utilities.FakeDataGenerator.*
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.FocusEvent


case class CellData[T](width: String, content: T)
case class HeaderData()
case class RowData(id: CellData[String], label: CellData[String], price: CellData[Int], count: CellData[Int]):
    
    def fullPrice: Double = price.content * count.content
    def getAsHTML() = tr(
      width := "100%",
      td(label.content, onClick --> handleCellClick, onDblClick --> handleCellDblClick),
      td(price.content, onClick --> handleCellClick, onDblClick --> handleCellDblClick),
      td(count.content, onClick --> handleCellClick, onDblClick --> handleCellDblClick),
      td("%.2f".format(fullPrice), onClick --> handleCellClick, onDblClick --> handleCellDblClick)
    )

final class Model:
  val dataVar: Var[List[RowData]] = Var(genDummydata(100))
  val dataSignal = dataVar.signal
  val headers: List[String] = dataVar.now().head.productElementNames.toList 
  val searchByOption: List[String] = headers
  val showOptions: List[String] = List("All", "Flagged")
end Model

def handleCellClick(event: MouseEvent): Unit = {
      dom.document.getElementsByClassName("selectedCell").map(element => element.classList.remove("selectedCell"))
      dom.document.getElementsByClassName("selectedRow").map(element => element.classList.remove("selectedRow"))
      event.target.asInstanceOf[HTMLTableCellElement].className = "selectedCell"
      event.target.asInstanceOf[HTMLTableCellElement].parentElement.className = "selectedRow"
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
              clickedCell.innerText = event.currentTarget.asInstanceOf[dom.html.Input].value
            }
            case _ =>
          }
        }
        input.onblur = (event: FocusEvent) => {clickedCell.innerText = originalValue }
        input.focus()
      )
}