logLevel := Level.Debug


resolvers += Resolver.url("my-test-repo", (baseDirectory.value / ".." / "example-ivy-repo").toURI.toURL)( Patterns("[organisation]/[module]/[revision]/[artifact]-[revision].[ext]") ) // (Resolver.ivyStylePatterns)


addSbtPlugin("com.playground" % "test-ivy-publish" % "0.0.6" % "compile->blah")
