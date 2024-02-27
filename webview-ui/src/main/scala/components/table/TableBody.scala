package components.table

import components.AuroraElement
import com.raquo.laminar.api.L.{*, given}

import types.Patient
import types.OpenFileMessage
import scala.scalajs.js.JSON
import scala.scalajs.js
import io.circe.parser._
import io.circe.generic.auto._
import utilities.JsonImplicits._
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLTableRowElement
import client.AuroraClient
import components.button.DeleteButton
import components.cells.FlagIcon
import components.cells.UneditableDiv
import components.cells.ToggleableInput
import components.utils.VscodeAPI.getVscodeApi
import types.TableConfig
import types.{given}

case class TableBody[T](config: TableConfig[T]) extends AuroraElement {

    // def getAsTableRow(
    //     item: Patient
    // ): ReactiveHtmlElement[HTMLTableRowElement] = {
    //     tr(
    //       width := "100%",
    //       onClick --> { (e) =>
    //           getVscodeApi().postMessage(
    //             OpenFileMessage(item.firstName, item.lastName, item.unitNumber)
    //                 .toJson()
    //           )
    //       },
    //       FlagIcon(item.flag.getOrElse(""), config.client, "flag", "item")
    //           .render(),
    //       UneditableDiv(item.unitNumber, config.client, "unitNumber", "item")
    //           .render(),
    //       ToggleableInput(item.firstName, config.client, "firstName", "item")
    //           .render(),
    //       ToggleableInput(item.lastName, config.client, "lastName", "item")
    //           .render(),
    //       ToggleableInput(item.sex, config.client, "sex", "item").render(),
    //       ToggleableInput(item.dob, config.client, "dob", "item").render(),
    //       ToggleableInput(
    //         item.hosp.getOrElse(""),
    //         config.client,
    //         "hosp",
    //         "item"
    //       )
    //           .render(),
    //       DeleteButton[Patient](item, "➖", config.client).render()
    //     )
    // }

    def render(): Element = {

        tbody(
          // Fetch the data on component mount, update table
          FetchStream.get(config.client.GETUrl) --> { responseText =>
              config.client.populateTable(responseText)
          },
          idAttr := "myTableBody",
          children <-- config.client.dataModelVar.signal.map(data =>
              data.map { item =>
                  val children = config.columnConfigs.map(column => {
                      //   println(column.cellHTML())
                      column.cellHTML(
                        config,
                        item.asInstanceOf[T]
                      )
                  })
                  //   getAsTableRow(item)
                  tr(
                    width := "100%",
                    onClick --> { (e) =>
                        getVscodeApi().postMessage(
                          OpenFileMessage(
                            item.firstName,
                            item.lastName,
                            item.unitNumber
                          )
                              .toJson()
                        )
                    },
                    children :+ DeleteButton(
                      config.rowIdentifier(item.asInstanceOf[T]),
                      "➖",
                      config.client
                    )
                        .render()
                  )
              }
          )
        )
    }

}
