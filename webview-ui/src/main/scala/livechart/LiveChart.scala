package livechart

import scala.scalajs.js
import scala.scalajs.js.annotation.*

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given} 

import org.scalajs.dom.HTMLTableElement
import org.scalajs.dom.HTMLTableRowElement
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.html
import org.scalajs.dom.HTMLBodyElement

import components.renderDataTable
import models.Model


@main
def LiveChart(): Unit = {

  // Get data model
  val model = new Model

  val allowedIcons = List("🎉", "🚀", "🍉")
  val iconVar = Var(initial = allowedIcons.head)
  
  renderOnDomContentLoaded(
    dom.document.body,
    div(
      width := "100%",
      div(
        display := "flex",
        marginBottom := "2rem",
        justifyContent := "space-around",
        select(
          onChange.mapToValue --> iconVar.writer,
          value <-- iconVar.signal,
          allowedIcons.map(icon => option(value(icon), icon))
        ),
        button(
          tpe := "button", 
          "Click me!",
          onClick --> { event => println("Clicked") }
        ),
        input(
          padding := "10px",
          width := " 25rem",
          placeholder("Search")
        ),
      ),
      renderDataTable(model),
    )
  )

  dom.document.addEventListener("keydown", (event: dom.KeyboardEvent) => {
      var selectedCell = dom.document.getElementsByClassName("selectedCell").headOption.map(_.asInstanceOf[HTMLTableCellElement])
      var tableIsFocused = dom.document.activeElement.isInstanceOf[HTMLBodyElement]

      selectedCell match{
        case None => null
        case Some(cell) => {
          if (event.key == "ArrowDown" && tableIsFocused) {
            // Get the current row and cell index
            val rowIndex = cell.parentElement.asInstanceOf[HTMLTableRowElement].rowIndex
            val cellIndex = cell.cellIndex
            // Move to the cell below, max -2 for the footer
            if (rowIndex < dom.document.getElementById("myTable").asInstanceOf[HTMLTableElement].rows.length - 2) {
              cell.classList.remove("selectedCell")
              dom.document.getElementById("myTable")
                .asInstanceOf[HTMLTableElement].rows(rowIndex + 1)
                .asInstanceOf[HTMLTableRowElement].cells(cellIndex).asInstanceOf[HTMLTableCellElement].classList.add("selectedCell")
            }
          }
          if (event.key == "ArrowUp" && tableIsFocused) {
            // Get the current row and cell index
            val rowIndex = cell.parentElement.asInstanceOf[HTMLTableRowElement].rowIndex
            val cellIndex = cell.cellIndex
            // Move to the cell above
            if (rowIndex > 1) {
              cell.classList.remove("selectedCell")
              dom.document.getElementById("myTable")
                .asInstanceOf[HTMLTableElement].rows(rowIndex - 1)
                .asInstanceOf[HTMLTableRowElement].cells(cellIndex).asInstanceOf[HTMLTableCellElement].classList.add("selectedCell")
            }
          }
          if (event.key == "ArrowLeft" && tableIsFocused) {
            // Get the current row and cell index
            val rowIndex = cell.parentElement.asInstanceOf[HTMLTableRowElement].rowIndex
            val cellIndex = cell.cellIndex
            // Move to the cell left
            if (cellIndex >= 1) {
              cell.classList.remove("selectedCell")
              dom.document.getElementById("myTable")
                .asInstanceOf[HTMLTableElement].rows(rowIndex)
                .asInstanceOf[HTMLTableRowElement].cells(cellIndex - 1).asInstanceOf[HTMLTableCellElement].classList.add("selectedCell")
            }
          }
          if (event.key == "ArrowRight" && tableIsFocused) {
            // Get the current row and cell index
            val rowIndex = cell.parentElement.asInstanceOf[HTMLTableRowElement].rowIndex
            val cellIndex = cell.cellIndex
            // Move to the cell left
            if (cellIndex < dom.document.getElementById("myTable").asInstanceOf[HTMLTableElement].rows(rowIndex).asInstanceOf[HTMLTableRowElement].cells.length - 1 ) {
              cell.classList.remove("selectedCell")
              dom.document.getElementById("myTable")
                .asInstanceOf[HTMLTableElement].rows(rowIndex)
                .asInstanceOf[HTMLTableRowElement].cells(cellIndex + 1).asInstanceOf[HTMLTableCellElement].classList.add("selectedCell")
            }
          }
        }
      }
      

      
    })
}
end LiveChart






