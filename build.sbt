name := "scala-epub"

version := "0.2"
/** Vette shit dit */

scalaVersion := "2.9.3"

libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "1.6.1",
    "org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test")

resolvers ++= Seq("snapshots" at "http://scala-tools.org/repo-snapshots",
                  "releases"  at "http://scala-tools.org/repo-releases")

