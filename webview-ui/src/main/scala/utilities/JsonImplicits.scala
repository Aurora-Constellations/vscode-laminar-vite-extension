package utilities

import io.circe.Decoder
import io.circe.generic.semiauto._
import io.circe.DecodingFailure
import io.circe.Encoder
import io.circe.Json
import types.Patient
import scalajs.js.Date

object JsonImplicits {

    implicit val patientDecoder: Decoder[Patient] = deriveDecoder[Patient]
    implicit val patientEncoder: Encoder[Patient] = deriveEncoder[Patient]

    implicit val sqlDateEncoder: Encoder[Date] =
        Encoder.encodeString.contramap((date: Date) => date.toString())
    implicit val sqlDateDecoder: Decoder[Date] = Decoder.instance { cursor =>
        cursor.as[String].flatMap { str =>
            try Right(new Date(str))
            catch {
                case _: IllegalArgumentException =>
                    Left(
                      DecodingFailure(
                        s"Invalid date format: $str",
                        cursor.history
                      )
                    )
            }
        }
    }

}
