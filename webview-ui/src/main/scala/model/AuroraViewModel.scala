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
import auroraview.addEventListeners
import org.scalajs.dom.BodyInit
// import sttp.client4._
// import sttp.client4.httpclient.HttpClientSyncBackend

// TODO Refactor these so they are more abstracted and higher level
// object dbUtils {
//     def update[T](row: dom.html.TableRow, dataVar: Var[List[T]]): Unit = {
//         println(dataVar)
//         val unitNumber = row.cells(0).asInstanceOf[dom.html.TableCell].innerText
//         println(unitNumber)
//         val updatedPatient = dataVar
//             .asInstanceOf[Var[List[Patient]]]
//             .signal
//             .now()
//             .filter(_.unitNumber == unitNumber)
//             .headOption
//         println(updatedPatient)
//         updatedPatient match {
//             case Some(value) => {
//                 println("Sending post request")
//                 println(
//                   value.toJson()
//                 )
//                 val backend = HttpClientSyncBackend()
//                 val response = basicRequest
//                     .body(value.toJson())
//                     .post(uri"http://192.168.250.125:9000/patients")
//                     .send(backend)

//                 // println(response.code)
//                 // fetch.post(
//                 //   "http://192.168.250.125:9000/patients",
//                 //   _.headers(("Authorization", "")),
//                 //   _.body(value.toJson())
//                 // ) --> { responseText =>
//                 //     println(responseText)
//                 // }
//             }
//             case None => print("Error getting updated patient. Oops!")
//         }
//     }
// }

// TODO allow actions/buttons to be added to toolbar
class AuroraViewModel(dataVar: Var[List[Patient]])
    extends Table[Patient](dataVar)
    with Toolbar[Patient](dataVar) {

    // val dataVar: Var[List[Patient]] = Var(List.empty[Patient])

    def render() = {
        addEventListeners[Patient](dataVar)
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
    val updateDataUrl = "http://192.168.250.125:9000/patients"
    def updateDb(newDataItem: Patient): Unit = {
        FetchStream.post(
          dataUrl,
          _.headers(("Authorization", "")),
          _.body(JSON.stringify(newDataItem.asInstanceOf[scala.scalajs.js.Any]))
        ) --> { responseText =>
            // jsonDecoder(responseText)
            //     .map(item => dataVar.update(_ :+ item))
        }
    }
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
          TableCell[Patient](item.unitNumber, dataVar).render(),
          TableCell[Patient](item.firstName, dataVar).render(),
          TableCell[Patient](item.lastName, dataVar).render(),
          TableCell[Patient](item.sex, dataVar).render(),
          TableCell[Patient](item.dob, dataVar).render(),
          TableCell[Patient](item.flag.getOrElse(""), dataVar).render(),
          TableCell[Patient](item.hosp.getOrElse(""), dataVar).render()
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
