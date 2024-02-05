package models

import com.raquo.laminar.api.L.{*, given}
import com.raquo.airstream.state.Var
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom
import org.scalajs.dom.MouseEvent

import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.FocusEvent
import scala.scalajs.js.JSON
import types.Patient
import scala.scalajs.js
import io.circe.parser._
import io.circe.generic.auto._
import utilities.JsonImplicits._
import components.table.TableCell
import components.table.Table
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLTableRowElement
import components.toolbar.Toolbar

// TODO allow actions/buttons to be added to toolbar
class AuroraViewModel() extends Table[Patient] with Toolbar[Patient] {

    def render() = {
        div(
          width := "100%",
          renderToolbar(),
          renderTable()
        )
    }

    /*
     * Table functions and variables. Change these as needed to correspond with the type of the data items
     */
    val dataUrl = "http://192.168.250.125:9000/patients"
    val headers: List[String] = List(
      "Unit Number",
      "First Name",
      "Last Name",
      "Sex",
      "Date of Birth",
      "In Hopsital",
      "Flag"
    )
    def getAsTableRow(
        item: Patient
    ): ReactiveHtmlElement[HTMLTableRowElement] = {

        tr(
          width := "100%",
          TableCell(item.unitNumber).render(),
          TableCell(item.firstName).render(),
          TableCell(item.lastName).render(),
          TableCell(item.sex).render(),
          TableCell(item.dob.toDateString()).render(),
          TableCell(item.flag.getOrElse("")).render(),
          TableCell(item.hosp.getOrElse("")).render()
        )
    }

    def decodeJson(jsonString: String): List[Patient] = {
        decode[List[Patient]](jsonString) match {
            case Right(patients) => patients
            case Left(error) =>
                throw new RuntimeException(s"Failed to parse JSON: $error")
        }
    }

    /*
     * Toolbar functions and variables. Change these as needed to correspond with the type of the data items
     */
    val searchByOption: List[String] = headers
    val showOptions: List[String] = List("Flagged")
}