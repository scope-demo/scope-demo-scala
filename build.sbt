name := "scope-demo-scala"

version := "0.1"

scalaVersion := "2.12.10"

resolvers += Resolver.mavenLocal

libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.8" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.2" % "test"

lazy val root = project
  .in(file("."))
  .enablePlugins(JavaAgent)
  .settings(
    javaAgents += "com.undefinedlabs.scope" % "scope-agent" % "0.2.1" % "test"
  )
