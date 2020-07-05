import traits.{CustomizableGreeter, DefaultGreeter}

object GreeterObject2 extends App {
  val greeter = new DefaultGreeter()
  greeter.greet("Scala developer")

  val customGreeter = new CustomizableGreeter("How are you, ", "?")
  customGreeter.greet("Scala developer")
}

