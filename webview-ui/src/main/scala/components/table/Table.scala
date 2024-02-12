package components.table

import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLTableRowElement
import com.raquo.airstream.state.Var

trait Table[T](dataVar: Var[List[T]]) {

    val headers: List[String]
    val dataUrl: String
    // val dataVar: Var[List[T]] = Var(List.empty[T])
    val dataSignal: StrictSignal[List[T]] = dataVar.signal
    def decodeJson(jsonString: String): List[T]
    def getAsTableRow(
        item: T
    ): ReactiveHtmlElement[HTMLTableRowElement]
    def renderTable(): Element = {
        div(
          className := "table-container",
          table(
            idAttr := "myTable",
            TableHeader(headers).render(),
            TableBody(dataUrl, dataVar, dataSignal, decodeJson, getAsTableRow)
                .render(),
            TableFooter().render()
          )
        )
    }

}
