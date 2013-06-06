//resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

//resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.2.0")

//addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse" % "1.5.0")

resolvers += Resolver.url("sbt-plugin-snapshots", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-snapshots"))(Resolver.ivyStylePatterns)

//addSbtPlugin("com.timushev.sbt" % "sbt-updates-plugin" % "0.1.0-SNAPSHOT")
libraryDependencies += Defaults.sbtPluginExtra("com.timushev.sbt" % "sbt-updates" % "0.1.1-SNAPSHOT", "0.12", "2.9.2")

