package components.table

import models.Model
import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}

case class TableRow[T](rowData: T) extends AuroraElement {

    def render(): Element = {
        tr(
          //   children <-- rowData.dataSignal.map(data =>
          //       data.map { item =>
          //           renderDataItem(item)
          //       }
          //   )
          //   width := "100%",
          //   td(
          //     label.content,
          //     onClick --> handleCellClick,
          //     onDblClick --> handleCellDblClick
          //   ),
          //   td(
          //     price.content,
          //     onClick --> handleCellClick,
          //     onDblClick --> handleCellDblClick
          //   ),
          //   td(
          //     count.content,
          //     onClick --> handleCellClick,
          //     onDblClick --> handleCellDblClick
          //   ),
          //   td(
          //     "%.2f".format(fullPrice),
          //     onClick --> handleCellClick,
          //     onDblClick --> handleCellDblClick
          //   )
        )
    }

}
