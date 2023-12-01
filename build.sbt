ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "argThatBug"
    , libraryDependencies ++= Seq(
      "org.specs2" %% "specs2-core" % "4.20.3" % Test
      , "org.specs2" %% "specs2-mock" % "4.20.3" % Test
    )
  )
