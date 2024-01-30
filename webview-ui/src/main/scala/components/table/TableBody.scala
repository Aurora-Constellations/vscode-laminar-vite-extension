package components.table

import models.Model
import components.utils.AuroraElement
import com.raquo.laminar.api.L.{*, given}

import types.Patient
import scala.scalajs.js.JSON
import scala.scalajs.js
import io.circe.parser._
import io.circe.generic.auto._
import utilities.JsonImplicits._

case class TableBody(model: Model) extends AuroraElement {

    def render(): Element = {
        tbody(
          // Fetch the data on component mount, update table
          FetchStream.get(model.dataUrl) --> { responseText =>
              model
                  .decodeJson(responseText)
                  .map(patient => model.dataVar.update(_ :+ patient))
          },
          idAttr := "myTableBody",
          children <-- model.dataSignal.map(data =>
              data.map { item =>
                  item.getAsTableRow()
              }
          )
        )
    }

}
