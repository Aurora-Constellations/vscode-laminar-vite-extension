package components

import models.Model
import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}

case class Table(model: Model) extends AuroraElement {
    def render(): Element = {
        div(
            className := "table-container",
            table(
            idAttr := "myTable",
            TableHeader(model).render(),
            TableBody(model).render(),
            TableFooter(model).render(),
            )
        )
    }
}