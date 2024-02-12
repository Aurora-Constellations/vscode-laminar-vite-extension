package auroraview

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom.HTMLTableElement
import org.scalajs.dom.HTMLTableRowElement
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.html
import org.scalajs.dom.HTMLBodyElement
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import components.table.Table
import components.toolbar.Toolbar
import org.scalajs.dom.HTMLInputElement
import components.table.toggleInput

def addEventListeners[T](dataVar: Var[List[T]]): Unit = {

    dom.document.addEventListener(
      "keydown",
      (event: dom.KeyboardEvent) => {
          var selectedCell = dom.document
              .getElementsByClassName("selectedCell")
              .headOption
              .map(_.asInstanceOf[HTMLTableCellElement])
          var tableIsFocused =
              dom.document.activeElement.isInstanceOf[HTMLBodyElement]

          selectedCell match {
              case None => null
              case Some(cell) => {
                  if (event.key == "ArrowDown" && tableIsFocused) {
                      event.preventDefault()
                      // Get the current row and cell index
                      val rowIndex = cell.parentElement
                          .asInstanceOf[HTMLTableRowElement]
                          .rowIndex
                      val cellIndex = cell.cellIndex
                      // Move to the cell below, max -2 for the footer
                      if (
                        rowIndex < dom.document
                            .getElementById("myTable")
                            .asInstanceOf[HTMLTableElement]
                            .rows
                            .length - 2
                      ) {
                          cell.classList.remove("selectedCell")
                          cell.parentElement.classList.remove("selectedRow")
                          dom.document
                              .getElementById("myTable")
                              .asInstanceOf[HTMLTableElement]
                              .rows(rowIndex + 1)
                              .asInstanceOf[HTMLTableRowElement]
                              .cells(cellIndex)
                              .asInstanceOf[HTMLTableCellElement]
                              .classList
                              .add("selectedCell")
                          dom.document
                              .getElementById("myTable")
                              .asInstanceOf[HTMLTableElement]
                              .rows(rowIndex + 1)
                              .asInstanceOf[HTMLTableRowElement]
                              .classList
                              .add("selectedRow")
                      }
                  }
                  if (event.key == "ArrowUp" && tableIsFocused) {
                      event.preventDefault()
                      // Get the current row and cell index
                      val rowIndex = cell.parentElement
                          .asInstanceOf[HTMLTableRowElement]
                          .rowIndex
                      val cellIndex = cell.cellIndex
                      // Move to the cell above
                      if (rowIndex > 1) {
                          cell.classList.remove("selectedCell")
                          cell.parentElement.classList.remove("selectedRow")
                          dom.document
                              .getElementById("myTable")
                              .asInstanceOf[HTMLTableElement]
                              .rows(rowIndex - 1)
                              .asInstanceOf[HTMLTableRowElement]
                              .cells(cellIndex)
                              .asInstanceOf[HTMLTableCellElement]
                              .classList
                              .add("selectedCell")
                          dom.document
                              .getElementById("myTable")
                              .asInstanceOf[HTMLTableElement]
                              .rows(rowIndex - 1)
                              .asInstanceOf[HTMLTableRowElement]
                              .classList
                              .add("selectedRow")
                      }
                  }
                  if (event.key == "ArrowLeft" && tableIsFocused) {
                      event.preventDefault()
                      // Get the current row and cell index
                      val rowIndex = cell.parentElement
                          .asInstanceOf[HTMLTableRowElement]
                          .rowIndex
                      val cellIndex = cell.cellIndex
                      // Move to the cell left
                      if (cellIndex >= 1) {
                          cell.classList.remove("selectedCell")
                          dom.document
                              .getElementById("myTable")
                              .asInstanceOf[HTMLTableElement]
                              .rows(rowIndex)
                              .asInstanceOf[HTMLTableRowElement]
                              .cells(cellIndex - 1)
                              .asInstanceOf[HTMLTableCellElement]
                              .classList
                              .add("selectedCell")
                      }
                  }
                  if (event.key == "ArrowRight" && tableIsFocused) {
                      event.preventDefault()
                      // Get the current row and cell index
                      val rowIndex = cell.parentElement
                          .asInstanceOf[HTMLTableRowElement]
                          .rowIndex
                      val cellIndex = cell.cellIndex
                      // Move to the cell left
                      if (
                        cellIndex < dom.document
                            .getElementById("myTable")
                            .asInstanceOf[HTMLTableElement]
                            .rows(rowIndex)
                            .asInstanceOf[HTMLTableRowElement]
                            .cells
                            .length - 1
                      ) {
                          cell.classList.remove("selectedCell")
                          dom.document
                              .getElementById("myTable")
                              .asInstanceOf[HTMLTableElement]
                              .rows(rowIndex)
                              .asInstanceOf[HTMLTableRowElement]
                              .cells(cellIndex + 1)
                              .asInstanceOf[HTMLTableCellElement]
                              .classList
                              .add("selectedCell")
                      }
                  }
                  if (event.ctrlKey && event.key == "Enter" && tableIsFocused) {
                      event.preventDefault()
                      toggleInput(cell, dataVar)
                  }
              }
          }
      }
    )
}
