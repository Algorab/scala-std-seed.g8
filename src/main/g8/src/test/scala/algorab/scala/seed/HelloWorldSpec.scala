package algorab.scala.seed

import org.scalatest.{Matchers, WordSpec}

class HelloWorldSpec extends WordSpec with Matchers {

  "The Hello World" should {
    "say hello world" in {
      HelloWorld.sayHelloWorld shouldEqual("Hello World")
    }
  }

}
