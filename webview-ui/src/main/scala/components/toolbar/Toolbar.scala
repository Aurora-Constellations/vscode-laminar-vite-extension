package components.toolbar

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.MouseEvent
// import models.*
import components.button.AddButton

import client.AuroraClient
import components.utils.AuroraElement

case class Toolbar(client: AuroraClient) extends AuroraElement {

    val searchByOption: List[String] = List(
      "Unit Number",
      "First Name",
      "Last Name",
      "Sex",
      "Date of Birth",
      "In Hopsital",
      "Flag"
    )
    val showOptions: List[String] = List("Flagged")

    def render(): Element = {
        div(
          className := "toolbar",
          Text("Search By:", ml = "").render(),
          Search("All" :: searchByOption).render(),
          Text("Show:").render(),
          Select("All" :: showOptions).render(),
          AddButton("➕", client).render()
        )
    }

}
