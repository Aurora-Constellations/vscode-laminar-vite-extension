package client

import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom
import org.scalajs.dom.HttpMethod
import types.Patient

class AuroraClient() {

    val dataModelVar = Var(List.empty[Patient])

    val GETUrl: String = "http://192.168.250.125:9000/patients"

    def addEntryToDataModelVar(newPatient: Patient): EventStream[String] = {
        println(s"Adding new  entry ${newPatient.unitNumber}...")
        dataModelVar.update((items) => {
            newPatient :: items
        })
        FetchStream.post(
          "http://192.168.250.125:9000/patients",
          _.body(newPatient.toJson())
        )
    }

    def updateEntryInDataModelVar(
        item: Patient,
        fieldName: String,
        newValue: String
    ): EventStream[String] = {
        println(s"Updating ${item.unitNumber} at field ${fieldName}...")
        dataModelVar
            .update((items) => {
                items.map(patient => {
                    patient.unitNumber == item.unitNumber match {
                        case true => {
                            updatePatient(
                              patient,
                              fieldName,
                              newValue
                            )
                        }
                        case false => patient
                    }
                })
            })
        FetchStream.put(
          s"http://192.168.250.125:9000/patients/${item.unitNumber}",
          _.body(
            updatePatient(
              item,
              fieldName,
              newValue
            )
                .toJson()
          )
        )
    }

    def deleteEntryInDataModelVar(unitNumber: String): EventStream[String] = {
        println("Deleting " + unitNumber + "...")
        dataModelVar.update((items) => {
            items.filter(_.unitNumber != unitNumber)
        })
        FetchStream.apply(
          method = _.DELETE,
          url = s"http://192.168.250.125:9000/patients/${unitNumber}"
        )
    }

    def updatePatient(
        patient: Patient,
        fieldName: String,
        newValue: String
    ): Patient = {
        fieldName match {
            case "unitNumber" =>
                println("Cannot change unitnumber")
            case "lastName"  => patient.lastName = newValue
            case "firstName" => patient.firstName = newValue
            case "sex"       => patient.sex = newValue
            case "dob"       => patient.dob = newValue
            case "hcn"       => patient.hcn = Option(newValue)
            case "family"    => patient.family = Option(newValue)
            case "famPriv"   => patient.famPriv = Option(newValue)
            case "hosp"      => patient.hosp = Option(newValue)
            case "flag"      => patient.flag = Option(newValue)
            case "address1" =>
                patient.address1 = Option(newValue)
            case "address2" =>
                patient.address2 = Option(newValue)
            case "city" => patient.city = Option(newValue)
            case "province" =>
                patient.province = Option(newValue)
            case "postalCode" =>
                patient.postalCode = Option(newValue)
            case "homePhoneNumber" =>
                patient.homePhoneNumber = Option(newValue)
            case "workPhoneNumber" =>
                patient.workPhoneNumber = Option(newValue)
            case "OHIP" => patient.OHIP = Option(newValue)
            case "familyPhysician" =>
                patient.familyPhysician = Option(newValue)
            case "attending" =>
                patient.attending = Option(newValue)
            case "collab1" => patient.collab1 = Option(newValue)
            case "collab2" => patient.collab2 = Option(newValue)
        }
        patient
    }

}
