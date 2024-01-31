package types

import scala.scalajs.js.Date

case class Patient(
    unitNumber: String,
    lastName: String,
    firstName: String,
    sex: String,
    dob: Date,
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
)
