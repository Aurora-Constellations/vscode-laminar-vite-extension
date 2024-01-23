package components

import models.Model
import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}

case class TableFooter(model: Model) extends AuroraElement {
    def render(): Element = {
        tfoot(
            tr(
                td(button("➕")),
                td(),
                td(),
                td(child.text <-- model.dataSignal.map(data => "%.2f".format(data.map(_.fullPrice).sum))),
            )
        )
    }
}