name := "ogm-example"

version := "1.0"

scalaVersion := "2.11.7"
val neo4jOgmVersion = "2.0.0-M02"

libraryDependencies += "org.neo4j" % "neo4j-ogm-api" % neo4jOgmVersion
libraryDependencies += "org.neo4j" % "neo4j-ogm-core" % neo4jOgmVersion
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3" % "runtime"
    