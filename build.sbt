name := "scala-skeleton"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.11.8" % "test",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.1" % "test")

