package models

import com.raquo.laminar.api.L.{*, given}
import com.raquo.airstream.state.Var
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom
import org.scalajs.dom.MouseEvent

import utilities.FakeDataGenerator.*
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.FocusEvent
import scala.scalajs.js.JSON
import types.Patient
import scala.scalajs.js
import io.circe.parser._
import io.circe.generic.auto._
import utilities.JsonImplicits._

final class Model:
    val dataUrl = "https://localhost:9000/patients"
    val dataVar: Var[List[Patient]] = Var(List.empty[Patient])
    val dataSignal = dataVar.signal
    val headers: List[String] = List(
      "Unit Number",
      "First Name",
      "Last Name",
      "Sex",
      "Date of Birth",
      "In Hopsital",
      "Flag"
    )
    val searchByOption: List[String] = headers
    val showOptions: List[String] = List("All", "Flagged")

    def decodeJson(jsonString: String): List[Patient] = {
        decode[List[Patient]](jsonString) match {
            case Right(patients) => patients
            case Left(error) =>
                throw new RuntimeException(s"Failed to parse JSON: $error")
        }
    }
end Model
