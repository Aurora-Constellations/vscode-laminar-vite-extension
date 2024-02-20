package components.table

import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}

import types.Patient
import scala.scalajs.js.JSON
import scala.scalajs.js
import io.circe.parser._
import io.circe.generic.auto._
import utilities.JsonImplicits._
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLTableRowElement
import client.AuroraClient
import components.button.DeleteButton
import components.cells.Icon
import components.cells.UneditableDiv
import components.cells.ToggleableInput

case class TableBody(client: AuroraClient) extends AuroraElement {

    def jsonDecoder(jsonString: String): List[Patient] =
        decode[List[Patient]](jsonString) match {
            case Right(patients) => patients
            case Left(error) =>
                throw new RuntimeException(s"Failed to parse JSON: $error")
        }

    def getAsTableRow(
        item: Patient
    ): ReactiveHtmlElement[HTMLTableRowElement] = {
        tr(
          width := "100%",
          Icon(item.flag.getOrElse(""), client, "flag", item)
              .render(),
          UneditableDiv(item.unitNumber, client, "unitNumber", item).render(),
          ToggleableInput(item.firstName, client, "firstName", item).render(),
          ToggleableInput(item.lastName, client, "lastName", item).render(),
          ToggleableInput(item.sex, client, "sex", item).render(),
          ToggleableInput(item.dob, client, "dob", item).render(),
          ToggleableInput(item.hosp.getOrElse(""), client, "hosp", item)
              .render(),
          DeleteButton[Patient](item, "➖", client).render()
        )
    }

    def render(): Element = {

        tbody(
          // Fetch the data on component mount, update table
          FetchStream.get(client.GETUrl) --> { responseText =>
              jsonDecoder(responseText)
                  .map(item => client.dataModelVar.update(_ :+ item))
          },
          idAttr := "myTableBody",
          children <-- client.dataModelVar.signal.map(data =>
              data.map { item =>
                  getAsTableRow(item)
              }
          )
        )
    }

}
