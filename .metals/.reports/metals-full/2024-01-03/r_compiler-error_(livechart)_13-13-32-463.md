file:///C:/Users/yashb/Documents/hello-world/webview-ui/src/main/scala/livechart/LiveChart.scala
### java.lang.AssertionError: assertion failed

occurred in the presentation compiler.

action parameters:
offset: 181
uri: file:///C:/Users/yashb/Documents/hello-world/webview-ui/src/main/scala/livechart/LiveChart.scala
text:
```scala
package livechart

import scala.scalajs.js
import scala.scalajs.js.annotation.*

import org.scalajs.dom
import com.raquo.laminar.api.Laminar.* 

@main
def LiveChart(): Unit@@ =
  renderOnDomContentLoaded(
    dom.document.body,
    div(
      button(
        tpe := "button", 
        "Click me!",
        onClick --> { event => println("Clicked") }
      )
    )
  )
  // dom.document.querySelector("app").innerHTML = s"""
  //   <div>
  //     <h1>AAAHHHHH</h1>
  //     <div class="card">
  //       <button id="counter" type="button"></button>
  //     </div>
  //     <p class="read-the-docs">
  //       Click on the Vite logo to learn more
  //     </p>
  //   </div>
  // """

  // setupCounter(dom.document.getElementById("counter"))
end LiveChart

def setupCounter(element: dom.Element): Unit =
  var counter = 0

  def setCounter(count: Int): Unit =
    counter = count
    element.innerHTML = s"count is $counter"

  element.addEventListener("click", e => setCounter(counter + 1))
  setCounter(0)
end setupCounter
```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:11)
	scala.meta.internal.pc.MetalsInteractive$.contextOfPath(MetalsInteractive.scala:45)
	scala.meta.internal.mtags.MtagsEnrichments$.localContext(MtagsEnrichments.scala:69)
	scala.meta.internal.pc.PcDefinitionProvider.ctx$lzyINIT1$1(PcDefinitionProvider.scala:51)
	scala.meta.internal.pc.PcDefinitionProvider.ctx$4(PcDefinitionProvider.scala:51)
	scala.meta.internal.pc.PcDefinitionProvider.definitions(PcDefinitionProvider.scala:52)
	scala.meta.internal.pc.PcDefinitionProvider.definitions(PcDefinitionProvider.scala:34)
	scala.meta.internal.pc.ScalaPresentationCompiler.definition$$anonfun$1(ScalaPresentationCompiler.scala:146)
```
#### Short summary: 

java.lang.AssertionError: assertion failed