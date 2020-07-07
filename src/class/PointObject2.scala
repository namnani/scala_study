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
  }
}
