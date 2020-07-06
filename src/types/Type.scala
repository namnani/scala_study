package types

object Type {
  def main(args: Array[String]): Unit = {
    var list: List[Any] = List(
      "a string",
      732,
      'c',
      true,
      () => "an anonymous function returning a string"
    )

    list.foreach(element => println(element))
  }
}
