package livechart

import scala.scalajs.js
import scala.scalajs.js.annotation.*

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given} 

val model = new Model
import model.*

@main
def LiveChart(): Unit = {
  
  renderOnDomContentLoaded(
    dom.document.body,
    div(
      width := "100%",
      h2(
        "Hello from Scala.js!!"
      ),
      button(

        tpe := "button", 
        "Click me!",
        onClick --> { event => println("Clicked") }
      ),
      renderDataTable(),
    )
  )
}
end LiveChart

def renderDataTable(): Element =
    table(
      width := "100%",
      thead(tr(th("Label"), th("Price"), th("Count"), th("Full price"), th("Action"))),
      tbody(
        children <-- dataSignal.map(data => data.map { item =>
          renderDataItem(item.id, item)
        }),
      ),
      tfoot(tr(
        td(button("➕")),
        td(),
        td(),
        td(child.text <-- dataSignal.map(data => "%.2f".format(data.map(_.fullPrice).sum))),
      )),
    )
end renderDataTable

def renderDataItem(id: DataItemID, item: DataItem): Element =
    tr(
      td(item.label),
      td(item.price),
      td(item.count),
      td("%.2f".format(item.fullPrice)),
      td(button("🗑️")),
    )
end renderDataItem




import scala.util.Random

final class DataItemID

case class DataItem(id: DataItemID, label: String, price: Double, count: Int):
  def fullPrice: Double = price * count

object DataItem:
  def apply(): DataItem =
    DataItem(DataItemID(), "?", Random.nextDouble(), Random.nextInt(5) + 1)
end DataItem

type DataList = List[DataItem]

final class Model:
  val dataVar: Var[DataList] = Var(List(DataItem(DataItemID(), "one", 1.0, 1)))
  val dataSignal = dataVar.signal

  def addDataItem(item: DataItem): Unit =
    dataVar.update(data => data :+ item)

  def removeDataItem(id: DataItemID): Unit =
    dataVar.update(data => data.filter(_.id != id))
end Model