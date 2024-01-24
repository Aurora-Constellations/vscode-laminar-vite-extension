package utilities

import models.RowData
import models.CellData
import scala.util.Random

import com.raquo.airstream.state.Var
import org.scalajs.dom

object FakeDataGenerator {

    val patientUrl = "https://localhost:9000/patients"

    val random = new Random()

    def generateRandomString(length: Int = 5): String = {
        val chars = ('a' to 'z') ++ ('A' to 'Z')
        (1 to length).map(_ => chars(random.nextInt(chars.length))).mkString
    }

    def genDummydata(num: Int): List[RowData] = {

        (1 to num).map { _ =>
            val width =
                random
                    .nextInt(500)
                    .toString // Adjust the range of width as needed
            val content = generateRandomString()
            RowData(
              CellData("50px", content),
              CellData("50px", content),
              CellData("50px", width.toInt),
              CellData("50px", width.toInt)
            )
        }.toList
    }
}
