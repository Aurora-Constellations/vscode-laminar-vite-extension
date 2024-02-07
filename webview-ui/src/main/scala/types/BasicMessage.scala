package types

import scala.scalajs.js.JSON
import scala.scalajs.js.Any

import utilities.JsonImplicits
import io.circe._
import io.circe.generic.auto._
import io.circe.parser._

trait Message {
    val command: String
    val content: String

}

case class BasicMessage(command: String, content: String) extends Message {
    def toJson(): String = {
        Printer.noSpaces
            .copy(dropNullValues = true)
            .print(
              Encoder[BasicMessage]
                  .apply(this)
            )
    }
}
