package components

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.MouseEvent
import models.*

def renderToolbar(searchByOption: List[String], showOptions: List[String]): Element =

    val searchByOptionVar = Var(initial = searchByOption.head)
    val showOptionsVar = Var(initial = showOptions.head)

    div(
        className :="toolbar",
        // justifyContent := "space-around",
        div(
          alignSelf :="center",
          marginRight := "5px",
          "Search By:"
        ),
        select(
          placeholder := "Search by",
          onChange.mapToValue --> searchByOptionVar.writer,
          value <-- searchByOptionVar.signal,
          searchByOption.map(icon => option(value(icon), icon))
        ),
        input(
          padding := "10px",
          width := "300px",
          placeholder("Search")
        ),
        div(
          alignSelf :="center",
          marginLeft := "25px",
          marginRight := "5px",
          "Show:"
        ),
        select(
          placeholder := "Show",
          onChange.mapToValue --> showOptionsVar.writer,
          value <-- showOptionsVar.signal,
          showOptions.map(icon => option(value(icon), icon))
        ),
        button("➕")
      )
end renderToolbar
