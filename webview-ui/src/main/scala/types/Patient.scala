package types

import scala.scalajs.js.Date
import scala.reflect.runtime.universe._
import org.scalajs.dom.Element
import com.raquo.laminar.api.L.{*, given}
import components.table.TableCell

trait Model {
    val headers: List[String]
}

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
) extends Model {

    val headers: List[String] = this.productElementNames.toList

    val rowDataVar = Var(List(this.unitNumber))
    def getAsTableRow() = {
        tr(
          width := "100%",
          TableCell(this.unitNumber).render(),
          TableCell(this.firstName).render(),
          TableCell(this.lastName).render(),
          TableCell(this.sex).render(),
          TableCell(this.dob.toDateString()).render(),
          TableCell(this.flag.getOrElse("")).render(),
          TableCell(this.hosp.getOrElse("")).render()
        )
    }
}
