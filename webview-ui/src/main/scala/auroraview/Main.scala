package auroraview

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}
import typings.vscodeWebview.mod.global.*
import models.RenderView
import types.BasicMessage
import scala.scalajs.js
import types.Patient
import model.AuroraDataModel

@main
def Main(): Unit = {

    val model = new AuroraDataModel()

    renderOnDomContentLoaded(
      dom.document.body,
      div(
        width := "100%",
        RenderView(model).render()
      )
    )

    println(BasicMessage("something", "Hello!").toJson())
    acquireVsCodeApi().postMessage(
      BasicMessage("something", "Hello!").toJson()
    )
}
end Main
