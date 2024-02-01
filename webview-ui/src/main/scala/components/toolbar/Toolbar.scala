package components.toolbar

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.MouseEvent
import models.*
import utilities.SearchGrid.searchGrid
import components.button.Button

trait Toolbar[T] {

    val searchByOption: List[String]
    val showOptions: List[String]

    def renderToolbar(): Element = {
        div(
          className := "toolbar",
          // justifyContent := "space-around",
          Text("Search By:", ml = "").render(),
          Search("All" :: searchByOption).render(),
          // Select(searchByOption).render(),
          // SearchInput().render(),
          Text("Show:").render(),
          Select("All" :: showOptions).render(),
          Button("➕").render()
        )
    }

}
