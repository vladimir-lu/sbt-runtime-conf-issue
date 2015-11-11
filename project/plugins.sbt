logLevel := Level.Warn

resolvers += Resolver.url("my-test-repo", new URL("file:///home/vlad/playground/ivy-repo"))( Patterns("[organisation]/[module]/[revision]/[artifact]-[revision].[ext]") ) // (Resolver.ivyStylePatterns)
// resolvers += Resolver.url("my-test-repo") artifacts
//  "file:///home/vlad/playground/test-ivy-publish/build/repo/[organisation]/[module]/[revision]/[artifact].[ext]"


addSbtPlugin("com.playground" % "test-ivy-publish" % "0.0.6" % "compile->blah")
