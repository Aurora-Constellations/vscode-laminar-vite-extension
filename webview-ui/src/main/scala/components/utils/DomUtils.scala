package components.utils

import org.scalajs.dom
import org.scalajs.dom.HTMLElement

object DomUtils {
    def removeClassnameFromAll(classname: String): Unit = {
        dom.document
            .getElementsByClassName(classname)
            .map(element => element.classList.remove(classname))
    }

    def addClassnameToElement(classname: String, element: HTMLElement): Unit = {
        element.classList.add(classname)
    }
}
