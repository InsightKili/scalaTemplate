ThisBuild / organization := "com.InsightsKili"
ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version      := "0.1.0-SNAPSHOT"

lazy val scalaProject = (project in file("main"))
  .settings(
    name := "scalaProject",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )
