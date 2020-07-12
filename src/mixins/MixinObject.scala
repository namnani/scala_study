package mixins

object MixinObject {
  def main(args: Array[String]): Unit = {
    val d = new D
    println(d.message)
    println(d.loudMessage)

    val richStringIter = new RichStringIter
    richStringIter.foreach(println)
  }
}
