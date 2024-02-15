package components.button

import com.raquo.laminar.api.L.{*, given}
import components.utils.AuroraElement
import types.Patient
import java.sql.Date

import client.AuroraClient

case class DeleteButton[T](item: T, value: String, dataModel: AuroraClient)
    extends AuroraElement {

    val showConfirmVar = Var(false)

    def renderConfirmButtons() = {
        div(
          display := "flex",
          flexDirection := "column",
          "Confirm delete:",
          div(
            button(
              "No",
              onClick --> { (e) =>
                  showConfirmVar.update(bool => !bool)
              }
            ),
            button(
              "Yes",
              onClick.flatMap(_ =>
                  showConfirmVar.update(bool => !bool)
                  dataModel.deleteEntryInDataModelVar(
                    item.asInstanceOf[Patient].unitNumber
                  )
              ) --> { resp => println(resp) }
            )
          )
        )
    }

    def ToggleableCofirmButtons(
        showInput: Signal[Boolean]
    ): Signal[HtmlElement] = {
        showInput.map {
            case true => renderConfirmButtons()
            case false =>
                button(
                  value,
                  onClick --> { (e) =>
                      showConfirmVar.update(bool => !bool)
                  }
                )
        }
    }

    def render(): Element = {
        div(
          child <-- ToggleableCofirmButtons(showConfirmVar.signal)
        )
    }

}
