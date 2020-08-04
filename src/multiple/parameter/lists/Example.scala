package multiple.parameter.lists

object Example {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val res = numbers.foldLeft(5)((a, b) => a + b)
    println(res)
  }
}
