package auroraview

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}

import models.AuroraViewModel

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
}
end Main
