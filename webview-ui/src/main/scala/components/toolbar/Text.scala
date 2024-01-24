package components.toolbar

import models.Model
import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}
import models.RowData
import utilities.SearchGrid.searchGrid

case class Text(value: String, as: String = "center", ml: String = "25px", mr: String = "5px") extends AuroraElement {

    def render(): Element = {
        div(
          alignSelf := as,
          marginLeft :=  ml,
          marginRight := mr,
          value
        )
    }
    
}