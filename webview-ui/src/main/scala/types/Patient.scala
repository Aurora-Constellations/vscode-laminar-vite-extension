package types

import scala.scalajs.js.Date
import scala.scalajs.js.JSON
import scala.scalajs.js.Any

import utilities.JsonImplicits
import io.circe._
import io.circe.generic.auto._
import io.circe.parser._

case class Patient(
    unitNumber: String,
    lastName: String,
    var firstName: String,
    sex: String,
    dob: String,
    hcn: Option[String],
    family: Option[String],
    famPriv: Option[String],
    hosp: Option[String],
    flag: Option[String],
    address1: Option[String],
    address2: Option[String],
    city: Option[String],
    province: Option[String],
    postalCode: Option[String],
    homePhoneNumber: Option[String],
    workPhoneNumber: Option[String],
    OHIP: Option[String],
    familyPhysician: Option[String],
    attending: Option[String],
    collab1: Option[String],
    collab2: Option[String]
) {
    def toJson(): String = {
        Printer.noSpaces
            .copy(dropNullValues = false)
            .print(
              Encoder[Patient]
                  .apply(this)
            )
    }
}
