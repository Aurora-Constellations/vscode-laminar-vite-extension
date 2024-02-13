package components.table

import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLTableRowElement
import com.raquo.airstream.state.Var
import model.AuroraDataModel
import types.Patient
import io.circe.parser._
import io.circe.generic.auto._
import org.scalajs.dom
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import scala.scalajs.js

trait Table[T](model: AuroraDataModel) {

    val headers: List[String]
    val dataUrl: String
    // val dataVar: Var[List[T]] = Var(List.empty[T])
    val dataSignal: StrictSignal[List[Patient]] = model.dataModelVar.signal
    def decodeJson(jsonString: String): List[Patient] =
        decode[List[Patient]](jsonString) match {
            case Right(patients) => patients
            case Left(error) =>
                throw new RuntimeException(s"Failed to parse JSON: $error")
        }
    def getAsTableRow(
        item: Patient
    ): ReactiveHtmlElement[HTMLTableRowElement]
    def renderTable(): Element = {
        div(
          className := "table-container",
          table(
            // tabIndex := 0,
            idAttr := "myTable",
            TableHeader(headers).render(),
            TableBody(
              dataUrl,
              model.dataModelVar,
              dataSignal,
              decodeJson,
              getAsTableRow
            ).render(),
            TableFooter().render(),
            onKeyDown --> (e =>
                val activeCell = dom.document.activeElement
                    .asInstanceOf[HTMLTableCellElement]
                // println(
                //   activeCell.nextElementSibling
                //       .asInstanceOf[HTMLElement]
                //       .focus()
                // )

                (e.ctrlKey, e.key) match {
                    case (_, "ArrowDown") =>
                        activeCell
                            .closest("tr")
                            .nextElementSibling
                            .asInstanceOf[HTMLTableRowElement]
                            .cells
                            .find(cell =>
                                cell.asInstanceOf[HTMLTableCellElement]
                                    .cellIndex == activeCell.cellIndex
                            )
                            .map(_.asInstanceOf[HTMLElement].focus())
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
