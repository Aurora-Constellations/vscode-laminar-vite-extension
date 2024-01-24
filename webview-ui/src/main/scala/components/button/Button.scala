package components.button

import com.raquo.laminar.api.L.{*, given}
import components.utils.AuroraElement

case class Button(value: String) extends AuroraElement {

    def render(): Element = {
        button(value)
    }
    
}