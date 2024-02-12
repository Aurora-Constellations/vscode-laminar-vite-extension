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
            idAttr := "myTable",
            TableHeader(headers).render(),
            TableBody(
              dataUrl,
              model.dataModelVar,
              dataSignal,
              decodeJson,
              getAsTableRow
            )
                .render(),
            TableFooter().render()
          )
        )
    }

}
