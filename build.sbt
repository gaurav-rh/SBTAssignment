name := "SBTAssignment"

version := "0.1"

scalaVersion := "2.12.12"

idePackagePrefix := Some("com.sbtassignment")

lazy val common = project.in(file("common"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.3.0-SNAP3",
      "org.scalaz" %% "scalaz-core" % "7.3.5",
      "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % "test",
      "org.mockito" %% "mockito-scala" % "1.16.46" % "test"
    ))

lazy val rest = project.in(file("rest"))
  .settings(
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http" % "10.2.7",
      "com.typesafe.akka" %% "akka-stream" % "2.6.17",
      "com.typesafe.akka" %% "akka-actor" % "2.6.17",
      "org.json4s" %% "json4s-native" % "4.0.3",
      "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.17" % "test",
      "com.typesafe.akka" %% "akka-http-testkit" % "10.2.7" % "test",
      "com.typesafe.akka" %% "akka-testkit" % "2.6.17" % "test"

    ))

lazy val root = project.in(file(".")).aggregate(common,rest)
