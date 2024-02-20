package components.table

import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLTableRowElement
import com.raquo.airstream.state.Var

import types.Patient
import io.circe.parser._
import io.circe.generic.auto._
import org.scalajs.dom
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import scala.scalajs.js
import components.utils.DomUtils.getHTMLTableRowElementOpt
import client.AuroraClient

case class Table(client: AuroraClient) extends AuroraElement {

    val headers: List[(String, String)] = List(
      ("Flag", "50px"),
      ("Unit Number", "150px"),
      ("First Name", "150px"),
      ("Last Name", "150px"),
      ("Sex", "150px"),
      ("Date of Birth", "150px"),
      ("In Hopsital", "150px")
    )

    def render(): Element = {
        div(
          className := "table-container",
          table(
            // tabIndex := 0,
            idAttr := "myTable",
            TableHeader(headers).render(),
            TableBody(
              client
            ).render(),
            TableFooter().render(),
            onKeyDown --> (e =>
                val activeCell = dom.document.activeElement
                    .asInstanceOf[HTMLTableCellElement]
                (e.ctrlKey, e.key) match {
                    case (_, "ArrowDown") => {
                        getHTMLTableRowElementOpt(
                          activeCell.closest("tr").nextElementSibling
                        ).map(
                          _.cells.find(cell =>
                              cell.asInstanceOf[HTMLTableCellElement]
                                  .cellIndex == activeCell.cellIndex
                          )
                        ).map(_.map(_.asInstanceOf[HTMLElement].focus()))
                    }
                    case (_, "ArrowUp") =>
                        activeCell
                            .closest("tr")
                            .previousElementSibling
                            .asInstanceOf[HTMLTableRowElement]
                            .cells
                            .find(cell =>
                                cell.asInstanceOf[HTMLTableCellElement]
                                    .cellIndex == activeCell.cellIndex
                            )
                            .map(_.asInstanceOf[HTMLElement].focus())
                    case (_, "ArrowLeft") =>
                        activeCell.previousElementSibling
                            .asInstanceOf[HTMLElement]
                            .focus()
                    case (_, "ArrowRight") =>
                        activeCell.nextElementSibling
                            .asInstanceOf[HTMLElement]
                            .focus()
                    case (true, "Enter") => {
                        e.preventDefault()
                        val simulatedEvent = new MouseEvent(
                          "dblclick",
                          js.undefined
                        )
                        activeCell.dispatchEvent(simulatedEvent)
                    }

                    case _ =>
                }
            )
          )
        )
    }

}
