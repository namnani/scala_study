import `class`.PointVal

object PointValObject {
  def main(args: Array[String]): Unit = {
    val point = new PointVal(1, 2)
    println(point)

    // 밑에 부분은 컴파일에러. 왜냐하면 생성자 signature가 val이었기 때문에
//    point.x = 3
  }
}
