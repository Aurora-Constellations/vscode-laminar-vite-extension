package configs

import types.TableConfig
import types.ColumnConfig
import types.{given}
import types.*
import client.AuroraClient

object PatientTrackerConfig {
    val config = TableConfig[Patient](
      new AuroraClient(),
      _.unitNumber,
      List(
        ColumnConfig[Patient](
          FlagIconType,
          "Flag",
          "50px",
          _.flag.getOrElse(""),
          "flag",
          true
        ),
        ColumnConfig[Patient](
          UneditableDivType,
          "Unit Number",
          "150px",
          _.unitNumber,
          "unitNumber"
        ),
        ColumnConfig[Patient](
          ToggleableInputType,
          "First Name",
          "150px",
          _.firstName,
          "firstName"
        ),
        ColumnConfig[Patient](
          ToggleableInputType,
          "Last Name",
          "150px",
          _.lastName,
          "lastName"
        ),
        ColumnConfig[Patient](
          ToggleableInputType,
          "Sex",
          "50px",
          _.sex,
          "sex"
        ),
        ColumnConfig[Patient](
          ToggleableInputType,
          "Date of Birth",
          "150px",
          _.dob,
          "dob"
        ),
        ColumnConfig[Patient](
          ToggleableInputType,
          "In Hopsital",
          "100px",
          _.hosp.getOrElse(""),
          "hosp"
        )
      )
    )
}
