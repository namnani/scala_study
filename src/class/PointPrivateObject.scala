import `class`.PointPrivate

object PointPrivateObject {
  def main(args: Array[String]): Unit = {
    val point1 = new PointPrivate
    point1.x = 99
    point1.y = 101
    println(point1.x)
    println(point1.y)
  }
}
