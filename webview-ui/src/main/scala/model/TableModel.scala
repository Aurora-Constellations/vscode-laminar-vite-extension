package models

import com.raquo.laminar.api.L.{*, given} 
import com.raquo.airstream.state.Var
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom
import org.scalajs.dom.MouseEvent

import utilities.FakeDataGenerator.*


case class CellData[T](width: String, content: T)
case class HeaderData()
case class RowData(id: CellData[String], label: CellData[String], price: CellData[Int], count: CellData[Int]):
    
    def fullPrice: Double = price.content * count.content
    def getAsHTML() = tr(
      width := "100%",
      td(label.content, onClick --> handleCellClick),
      td(price.content, onClick --> handleCellClick),
      td(count.content, onClick --> handleCellClick),
      td("%.2f".format(fullPrice), onClick --> handleCellClick)
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