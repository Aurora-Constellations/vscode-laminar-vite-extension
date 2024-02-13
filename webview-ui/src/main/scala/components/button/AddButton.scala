package components.button

import com.raquo.laminar.api.L.{*, given}
import components.utils.AuroraElement
import types.Patient
import java.sql.Date
import model.AuroraDataModel
import scala.util.Random

case class AddButton[T](value: String, dataModel: AuroraDataModel)
    extends AuroraElement {

    def render(): Element = {

        button(
          value,
          onClick.flatMap(_ =>
              val random = new Random()
              val randomNumber = random.nextInt(90000000) + 10000000
              // TODO make the unit number random
              val newPatient = Patient(
                "TB" + randomNumber.toString(),
                "",
                "",
                "",
                "2023-04-04",
                None,
                None,
                None,
                None,
                None,
                None,
                None,
                None,
                None,
                None,
                None,
                None,
                None,
                None,
                None,
                None,
                None
              )
              dataModel.addEntryToDataModelVar(newPatient)
          ) --> { responseText =>
              println(responseText)
          }
        )
    }

}
