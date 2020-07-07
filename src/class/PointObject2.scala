import `class`.Point

object PointObject2 {
  def main(args: Array[String]): Unit = {
    val point1 = new Point(2, 3)
    println(point1.x)
    println(point1)

    val origin = new Point()
    val point2 = new Point(1)
    println(origin)
    println(point2)

    val point3 = new Point(y = 2)
    println(point3)

    val point4 = new Point(1, 2)
    println(point4)
    point4.x = 4

    //밑에 부분은 컴파일 에러나는 부분. val은 재할당 못함.
    //point4 = new Point(2,3)
    println(point4)
  }
}
