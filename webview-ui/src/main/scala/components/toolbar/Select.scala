package components.toolbar

import models.Model
import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}
import models.RowData
import utilities.SearchGrid.searchGrid

case class Select(options: List[String]) extends AuroraElement {

    val optionsVar = Var(initial = options.head)

    def render(): Element = {
        select(
          onChange.mapToValue --> optionsVar.writer,
          value <-- optionsVar.signal,
          options.map(icon => option(value(icon), icon))
        )
    }
    
}