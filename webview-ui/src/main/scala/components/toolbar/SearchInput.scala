package components.toolbar

import models.Model
import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}
import models.RowData
import utilities.SearchGrid.searchGrid

case class SearchInput() extends AuroraElement {

    def render(): Element = {
        input(
          idAttr := "search-input",
          padding := "10px",
          width := "300px",
          placeholder("Search"),
          onKeyUp --> searchGrid
        )
    }
    
}