package models

import scala.util.Random
import com.raquo.laminar.api.L.{*, given} 
import com.raquo.airstream.state.Var
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom
import org.scalajs.dom.MouseEvent

final class DataItemID

def handleCellClick(event: MouseEvent): Unit = {
      dom.document.getElementsByClassName("selectedCell").map(element => element.classList.remove("selectedCell"))
      event.target.asInstanceOf[HTMLTableCellElement].className = "selectedCell"
    }

// Data row
case class DataItem(id: DataItemID, label: String, price: Double, count: Int):
    def fullPrice: Double = price * count
    // change to return proper data row format
    def getAsRow() = tr(
      td(label, onClick --> handleCellClick),
      td(price, onClick --> handleCellClick),
      td(count, onClick --> handleCellClick),
      td("%.2f".format(fullPrice), onClick --> handleCellClick)
    )

// All data
type DataList = List[DataItem]

final class Model:
  val dataVar: Var[DataList] = Var(List(
    DataItem(DataItemID(), "one", 1.0, 1), 
    DataItem(DataItemID(), "two", 3.0, 2)
))
  val dataSignal = dataVar.signal
  val headers: List[String] = dataVar.now().head.productElementNames.toList

  def addDataItem(item: DataItem): Unit =
    dataVar.update(data => data :+ item)

  def removeDataItem(id: DataItemID): Unit =
    dataVar.update(data => data.filter(_.id != id))
end Model