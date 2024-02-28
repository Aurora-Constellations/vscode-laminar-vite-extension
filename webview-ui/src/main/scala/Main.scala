import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}
import typings.vscodeWebview.mod.global.*
import types.BasicMessage
import scala.scalajs.js
import types.Patient

import client.AuroraClient
import components.toolbar.Toolbar
import components.table.Table
import types.TableConfig
import types.ColumnConfig
import types.{given}
import types.*

import configs.PatientTrackerConfig.config

import components.cells._

@main
def Main(): Unit = {

    val tableConfig = config
    renderOnDomContentLoaded(
      dom.document.body,
      div(
        width := "100%",
        div(
          width := "100%",
          Toolbar[Patient](tableConfig).render(),
          Table[Patient](tableConfig).render()
        )
      )
    )
}
end Main
