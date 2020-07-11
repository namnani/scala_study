package named.arguments

object NamedArguments {
  def printName(first: String, last: String): Unit = {
    println(first + " " + last)
  }

  def main(args: Array[String]): Unit = {
    printName("John", "Smith")
    printName(first = "John", last = "Smith")
    printName(last = "Smith", first = "John")
  }
}
