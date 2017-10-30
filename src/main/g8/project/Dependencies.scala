import sbt._

object Dependencies {

  /*
   * Test dependencies
   */
  private object Test {
    private lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    lazy val testDeps = Seq(scalaTest)
  }

  /*
   * Version definitions
   */

  /*
   * Compile dependencies
   */
  private object Compile {

    lazy val compileDeps = Seq(

    )
  }

  import Test._
  import Compile._

  lazy val dependencies = testDeps ++ compileDeps

}
