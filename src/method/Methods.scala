package method

object Methods extends App {
  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier

  def name: String = System.getProperty("user.name")

  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
  }

  println(getSquareString(2.5))
  println(addThenMultiply(1, 2)(3))
  println("Hello, " + name + "!")
}
