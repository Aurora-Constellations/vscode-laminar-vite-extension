package components.table

import models.Model
import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}
import models.RowData

case class TableBody(model: Model) extends AuroraElement {

    def renderDataItem(item: RowData): Element = {
        val row = item.getAsHTML()
        row
    }

    def render(): Element = {
        tbody(
            idAttr := "myTableBody",
            children <-- model.dataSignal.map(data => data.map { item =>
            renderDataItem(item)
            }),
        )
    }
    
}