package multiple.parameter.lists

object Example3 {
  def execute(arg: Int)(implicit ec: scala.concurrent.ExecutionContext) = ???

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numberFunc = numbers.foldLeft(List[Int]()) _

    val squares = numberFunc((xs, x) => xs :+ x*x)
    println(squares)

    val cubes = numberFunc((xs, x) => xs :+ x*x*x)
    println(cubes)
  }
}
