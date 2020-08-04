package multiple.parameter.lists

object Example2 {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    def firstWay = foldLeft1[Int, Int](numbers, 0, _ + _)
    def secondWay = foldLeft1(numbers, 0, (a: Int, b: Int) => a + b)
//    def notPossible = foldLeft1(numbers, 0, _ + _)

    def foldLeft2[A, B](as: List[A], b0: B)(op: (B, A) => B) = ???
    def possible = foldLeft2(numbers, 0)(_ + _)
  }

  def foldLeft1[A, B](as: List[A], b0: B, op: (B, A) => B) = ???
}
