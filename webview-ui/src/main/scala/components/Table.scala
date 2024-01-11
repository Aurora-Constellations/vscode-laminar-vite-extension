package components

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.MouseEvent
import models.*

def renderDataTable(model: Model): Element =
  div(
    className := "table-container",
    table(
      thead(
        tr(
            model.headers.map(header => {
                th(header)
            }),
        )
      ),
      tbody(
        children <-- model.dataSignal.map(data => data.map { item =>
          renderDataItem(item)
        }),
      ),
      tfoot(tr(
        td(button("➕")),
        td(),
        td(),
        td(child.text <-- model.dataSignal.map(data => "%.2f".format(data.map(_.fullPrice).sum))),
      )),
    )
  )
end renderDataTable

def renderDataItem(item: RowData): Element =
    def handleCellClick(event: MouseEvent): Unit = {
      dom.document.getElementsByClassName("selectedCell").map(element => element.classList.remove("selectedCell"))
      event.target.asInstanceOf[HTMLTableCellElement].className = "selectedCell"
    }

    val row = item.getAsHTML()
    row

    
end renderDataItem