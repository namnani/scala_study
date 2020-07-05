import `class`.Greeter

object GreeterObject extends App{
  val greeter = new Greeter("Hello, ", "!")
  greeter.greet("Scala developer")
}

