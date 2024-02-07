package auroraview

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}
import typings.vscodeWebview.mod.global.*
import models.AuroraViewModel
import types.BasicMessage
import scala.scalajs.js

@main
def Main(): Unit = {

    renderOnDomContentLoaded(
      dom.document.body,
      div(
        width := "100%",
        AuroraViewModel().render()
      )
    )
    addEventListeners()
    println(BasicMessage("something", "Hello!").toJson())
    acquireVsCodeApi().postMessage(
      BasicMessage("something", "Hello!").toJson()
    )
}
end Main
