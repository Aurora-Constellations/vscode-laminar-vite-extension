import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}
import typings.vscodeWebview.mod.global.*
import types.BasicMessage
import scala.scalajs.js
import types.Patient

import client.AuroraClient
import components.toolbar.Toolbar
import components.table.Table

@main
def Main(): Unit = {

    val client = new AuroraClient()

    renderOnDomContentLoaded(
      dom.document.body,
      div(
        width := "100%",
        div(
          width := "100%",
          Toolbar(client).render(),
          Table(client).render()
        )
      )
    )
}
end Main
