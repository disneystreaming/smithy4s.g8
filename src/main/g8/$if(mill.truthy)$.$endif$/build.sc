import \$ivy.`com.disneystreaming.smithy4s::smithy4s-mill-codegen-plugin::$smithy4s_version$`

import smithy4s.codegen.mill._
import mill._, mill.scalalib._

object service extends SbtModule with Smithy4sModule {

  def millSourcePath = os.pwd
  def smithy4sInputDirs = T.sources(millSourcePath / "src" / "main" / "smithy")

  def scalaVersion = "2.13.12"
  override def ivyDeps = Agg(
    ivy"com.disneystreaming.smithy4s::smithy4s-core:\${smithy4sVersion()}",
    ivy"com.disneystreaming.smithy4s::smithy4s-http4s-swagger:\${smithy4sVersion()}",
    ivy"org.http4s::http4s-ember-server:0.23.28"
  )
}
