package utilities

import org.scalajs.dom
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTableElement
import org.scalajs.dom.HTMLTableRowElement
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import com.raquo.airstream.state.StrictSignal
import org.scalajs.dom.KeyboardEvent

object SearchGrid {

    def searchGrid(event: KeyboardEvent, opt: StrictSignal[String]): Unit = {
        println(opt.now())
        val input = dom.document
            .getElementById("search-input")
            .asInstanceOf[HTMLInputElement]
        val filter = input.value.toLowerCase()
        val table = dom.document
            .getElementById("myTableBody")
            .asInstanceOf[HTMLTableElement];
        val rows = table.getElementsByTagName("tr");

        rows.map(row => {
            val contentToSearch = row
                .asInstanceOf[HTMLTableRowElement]
                .cells
                .map(cell => cell.asInstanceOf[HTMLTableCellElement].innerText)
                .toList
                .mkString(" ")
            contentToSearch.toLowerCase().contains(filter) match {
                case true =>
                    row.asInstanceOf[HTMLTableRowElement].style.display = ""
                case false =>
                    row.asInstanceOf[HTMLTableRowElement].style.display = "none"
            }
        })
    }

}
