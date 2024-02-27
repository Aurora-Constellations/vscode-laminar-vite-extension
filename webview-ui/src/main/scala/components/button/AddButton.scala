package components.button

import com.raquo.laminar.api.L.{*, given}
import components.AuroraElement
import types.Patient
import java.sql.Date
import client.AuroraClient

case class AddButton(value: String, client: AuroraClient)
    extends AuroraElement {

    def render(): Element = {

        button(
          value,
          onClick.flatMap(_ => client.addEntryToDataModelVar()) --> {
              responseText =>
                  println(responseText)
          }
        )
    }

}
