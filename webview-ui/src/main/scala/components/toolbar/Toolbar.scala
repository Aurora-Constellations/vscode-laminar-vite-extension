package components.toolbar

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.MouseEvent
import models.*
import components.button.Button
import model.AuroraDataModel

trait Toolbar[T](dataModel: AuroraDataModel) {

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
          Button[T]("➕", dataModel).render()
        )
    }

}
