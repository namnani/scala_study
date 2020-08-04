package nested.methods

object FactorialObject {
  def factorial(x: Int): Int = {
    def fact(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else fact(x - 1, x * accumulator)
    }
    fact(x, 1)
  }

  def main(args: Array[String]): Unit = {
    println("Factorial of 2: " + factorial(2))
    println("Factorial of 3: " + factorial(3))
  }
}
