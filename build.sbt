name := "sbt-runtime-conf-issue"

version := "1.0"

scalaVersion := "2.11.7"


// FIXME - well, this hits https://github.com/sbt/sbt/issues/535
resolvers += Resolver.url("my-test-repo", (baseDirectory.value / "example-ivy-repo").toURI.toURL)( Patterns("[organisation]/[module]/[revision]/[artifact]-[revision].[ext]") ) // (Resolver.ivyStylePatterns)


libraryDependencies += "com.playground" % "test-ivy-publish" % "0.0.6" % "compile->blah"
