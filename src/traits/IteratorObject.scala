import traits.IntIterator

object IteratorObject {
  def main(args: Array[String]): Unit = {
    val iterator = new IntIterator(10)
    println(iterator.next())
    println(iterator.next())
  }
}
