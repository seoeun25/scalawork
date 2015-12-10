import sbt._
import Process._
import Keys._

val derby = "org.apache.derby" % "derby" % "10.4.1.3"

lazy val commonSettings = Seq(
  organization := "com.nexr",
  version := "0.1.0",
  scalaVersion := "2.10.4"
)

lazy val root = (project in file(".")).
  settings(commonSettings:_*).
  settings(
    name := "scalawork",
    libraryDependencies += derby
  )

