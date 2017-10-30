import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "scala.seed",
      scalaVersion := "2.12.3",
      version      := "0.0.1-SNAPSHOT"
    )),
    name := "hello-world",
    libraryDependencies ++= dependencies,
    mainClass := Some("algorab.scala.seed.HelloWorld")
  )
