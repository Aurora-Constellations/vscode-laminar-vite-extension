package components.utils

import typings.vscodeWebview.mod.global.*

object VscodeAPI {
    val vscodeApi = acquireVsCodeApi()
    def getVscodeApi() = vscodeApi
}
