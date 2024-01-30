import org.scalajs.linker.interface.ModuleSplitStyle

lazy val livechart = project
    .in(file("."))
    .enablePlugins(ScalaJSPlugin) // Enable the Scala.js plugin in this project
    .settings(
      scalaVersion := "3.3.1",

      // Tell Scala.js that this is an application with a main method
      scalaJSUseMainModuleInitializer := true,

      /* Configure Scala.js to emit modules in the optimal way to
       * connect to Vite's incremental reload.
       * - emit ECMAScript modules
       * - emit as many small modules as possible for classes in the "livechart" package
       * - emit as few (large) modules as possible for all other classes
       *   (in particular, for the standard library)
       */
      scalaJSLinkerConfig ~= {
          _.withModuleKind(ModuleKind.ESModule)
              .withModuleSplitStyle(
                ModuleSplitStyle.SmallModulesFor(List("livechart"))
              )
      },

      /* Depend on the scalajs-dom library.
       * It provides static types for the browser DOM APIs.
       */
      libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.4.0",
      libraryDependencies += "com.raquo" %%% "laminar" % "16.0.0",
      libraryDependencies += "io.circe" %%% "circe-core" % "0.14.3",
      libraryDependencies += "io.circe" %%% "circe-generic" % "0.14.3",
      libraryDependencies += "io.circe" %%% "circe-parser" % "0.14.3",
      libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.13.12"
    )
