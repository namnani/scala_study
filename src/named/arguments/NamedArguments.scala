package named.arguments

object NamedArguments {
  def printName(first: String, last: String): Unit = {
    println(first + " " + last)
  }

  def printName(first: String, middle: String, last: String): Unit = {
    println(first + " " + middle + " " + last)
  }

  def main(args: Array[String]): Unit = {
    printName("John", "Smith")
    printName(first = "John", last = "Smith")
    printName(last = "Smith", first = "John")

    // printName(last = "Smith", "john") // error : positional after named argument

    //Note that named arguments do not work with calls to Java methods.

    printName("Nani", last = "bye", middle = "hi")
    printName("Nani", middle = "hi", last = "bye")
  }
}
