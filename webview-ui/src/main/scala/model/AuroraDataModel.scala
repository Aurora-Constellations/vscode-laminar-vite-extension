package model

import types.Patient

import com.raquo.laminar.api.L.{*, given}

class AuroraDataModel {

    val dataModelVar = Var(List.empty[Patient])

    def addEntryToDataModelVar(newPatient: Patient): EventStream[String] = {
        println("Adding entry!")
        dataModelVar.update((items) => {
            items.::(newPatient)
        })
        FetchStream.post(
          "http://192.168.250.125:9000/patients",
          _.body(newPatient.toJson())
        )
    }

    def updateEntryInDataModelVar(
        unitNumber: String,
        fieldName: String,
        newValue: String
    ) = {
        // dataModelVar.signal.split(_.unitNumber)((unitNumber: String, initialPatient: Patient, patientSignal: Signal[Patient]) => {

        // })
        var updatedPatient: Option[Patient] = None
        dataModelVar.update((items) => {

            items.map(patient => {
                patient.unitNumber.equals(unitNumber) match {
                    case false => {
                        patient
                    }
                    case true => {
                        fieldName match {
                            case "unitNumber" =>
                                println("Cannot change unitnumber")
                            case "lastName"  => patient.lastName = newValue
                            case "firstName" => patient.firstName = newValue
                            case "sex"       => patient.sex = newValue
                            case "dob"       => patient.dob = newValue
                            case "hcn"       => patient.hcn = Option(newValue)
                            case "family"  => patient.family = Option(newValue)
                            case "famPriv" => patient.famPriv = Option(newValue)
                            case "hosp"    => patient.hosp = Option(newValue)
                            case "flag"    => patient.flag = Option(newValue)
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
                        updatedPatient = Some(patient)
                        patient
                    }
                }

            })

        })
        println(updatedPatient.get)
        println(s"http://192.168.250.125:9000/patients/${unitNumber}")
        FetchStream.put(
          s"http://192.168.250.125:9000/patients/${unitNumber}",
          _.body(updatedPatient.get.toJson())
        ) // --> { resp => println(resp) }
    }
}
