package components.button

import com.raquo.laminar.api.L.{*, given}
import components.utils.AuroraElement
import types.Patient
import java.sql.Date
import model.AuroraDataModel

case class Button[T](value: String, dataModel: AuroraDataModel)
    extends AuroraElement {

    def render(): Element = {
        button(
          value,
          onClick.flatMap(_ =>
              // TODO make the unit number random
              val newPatient = Patient(
                "TB123456",
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
