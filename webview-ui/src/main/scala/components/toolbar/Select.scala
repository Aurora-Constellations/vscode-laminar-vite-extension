package components.toolbar

import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}

import utilities.SearchGrid.searchGrid

case class Select(options: List[String]) extends AuroraElement {

    val optionsVar = Var(initial = options.headOption.getOrElse("All"))

    def render(): Element = {
        select(
          onChange.mapToValue --> optionsVar.writer,
          value <-- optionsVar.signal,
          options.map(icon => option(value(icon), icon))
        )
    }

}
