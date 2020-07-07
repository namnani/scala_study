import `class`.PointWithoutValOrVar

object PointWithoutValOrVarObject {
  def main(args: Array[String]): Unit = {
    val point = new PointWithoutValOrVar(1, 2)
    // 밑에는 컴파일에러. 왜냐하면 constructor signature에서 val이나 var이 없으면 private value이므로.
//    point.x = 3
  }
}
