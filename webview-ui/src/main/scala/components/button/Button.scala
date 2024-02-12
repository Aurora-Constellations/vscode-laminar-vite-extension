package components.button

import com.raquo.laminar.api.L.{*, given}
import components.utils.AuroraElement
import types.Patient
import java.sql.Date

case class Button[T](value: String, dataVar: Var[List[T]])
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
              dataVar.update((items) => {
                  items.::(newPatient.asInstanceOf[T])
              })
              FetchStream.post(
                "http://192.168.250.125:9000/patients",
                _.body(newPatient.toJson())
              )
          ) --> { responseText =>
              println(responseText)
          }
        )
    }

}
