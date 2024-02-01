package livechart

import scala.scalajs.js
import scala.scalajs.js.annotation.*

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}

import org.scalajs.dom.HTMLTableElement
import org.scalajs.dom.HTMLTableRowElement
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.html
import org.scalajs.dom.HTMLBodyElement
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import components.table.Table
import models.AuroraTracker
import components.toolbar.Toolbar
import org.scalajs.dom.HTMLInputElement

import com.raquo.airstream.web.AjaxStream
import com.raquo.airstream.web.AjaxStream.AjaxStreamError

import io.circe._
import io.circe.parser._
import types.Patient
import scala.scalajs.js.JSON

@main
def LiveChart(): Unit = {

    renderOnDomContentLoaded(
      dom.document.body,
      div(
        width := "100%",
        AuroraTracker().render()
      )
    )
    addEventListeners()
}
end LiveChart
