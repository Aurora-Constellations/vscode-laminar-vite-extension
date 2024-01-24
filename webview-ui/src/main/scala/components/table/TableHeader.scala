package components.table

import models.Model
import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}
import utilities.SortGrid.SortOrder.*
import utilities.SortGrid.*
import org.scalajs.dom

case class TableHeader(model: Model) extends AuroraElement {

    var ascendingSort = true
    def setAscendingSort(value: Boolean): Unit = {
        ascendingSort = value
    }
    var sortOrderMap: Map[Int, SortOrder] = Map()

    def onHeaderClick(event: dom.Event): Unit = {
        val clickedHeader = event.currentTarget.asInstanceOf[dom.html.TableCell]
        val columnIndex = clickedHeader.cellIndex

        // Get the current sort order for the column or default to Ascending
        val currentSortOrder = sortOrderMap.getOrElse(columnIndex, Ascending)

        // Extract the table rows and convert them to a list
        val tableRows = dom.document.querySelectorAll("tbody tr")
        val rowsList = List.tabulate(tableRows.length)(i => tableRows.item(i))

        // Sort the rows based on the content of the clicked column using the sortGrid function
        val sortedRows = rowsList.sortBy { row =>
        val cellValue = row.children.item(columnIndex).textContent
        cellValue
        }(sortGrid(currentSortOrder))

        // Update the sort order for the column
        val newSortOrder = if (currentSortOrder == Ascending) Descending else Ascending
        sortOrderMap += (columnIndex -> newSortOrder)

        // Clear the table body 
        val tableBody = dom.document.querySelector("tbody")
        tableBody.innerHTML = ""

        // Append the sorted rows to the table body
        sortedRows.foreach(tableBody.appendChild)
    }

    def render(): Element = {
        thead(
            tr(
                model.headers.map(header => {
                    th(header, onClick --> onHeaderClick)
                }),
            )
        )
    }
}