package types

object TypeCasting {
  def main(args: Array[String]): Unit = {
      val x: Long = 987654321
      val y: Float = x

      println(x)
      println(y)

      val face: Char = '☺'
      val number: Int = face

      println(face)
      println(number)

    val nani: Long = 987654321
    val yy: Float = nani
//    var zz: Long = yy

    println(nani)
    println(yy)
//    println(zz)

    val nani2: Int = 7
    val nani3: Long = nani2

    println(nani2)
    println(nani3)
  }
}
