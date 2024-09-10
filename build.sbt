lazy val root = (project in file("."))
  .enablePlugins(ScriptedPlugin)
  .settings(phantomDeps)
  .settings(
    name := "smithy4s.g8",
    Test / test := {
      val _ = (Test / g8Test).toTask("").value
    },
    scriptedLaunchOpts ++= List(
      "-Xms1024m",
      "-Xmx1024m",
      "-XX:ReservedCodeCacheSize=128m",
      "-Xss2m",
      "-Dfile.encoding=UTF-8"
    )
  )

// https://github.com/scala-steward-org/scala-steward/issues/1286#issuecomment-582083463
// ensuring deps are updated inside of templates files
lazy val phantomDeps = Def.settings(
  libraryDependencies ++= Seq(
    "org.http4s" %% "http4s-ember-server" % "0.23.28"
  )
)
