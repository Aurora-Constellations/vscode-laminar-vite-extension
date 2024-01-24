package components.toolbar

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.MouseEvent
import models.*
import utilities.SearchGrid.searchGrid
import components.button.Button 

case class Toolbar(searchByOption: List[String], showOptions: List[String]) {

  def render(): Element = {
    div(
        className :="toolbar",
        // justifyContent := "space-around",
        Text("Search By:", ml = "").render(),
        Select(searchByOption).render(),
        SearchInput().render(),
        Text("Show:").render(),
        Select(showOptions).render(),
        Button("➕").render()
      )
  }

}
