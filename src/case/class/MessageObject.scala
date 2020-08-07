import `case`.`class`.Message

object MessageObject {
  def main(args: Array[String]): Unit = {
    val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "a ya?")

    println(message1.sender)
//    message1.sender = "nani@naver.com"
//    println(message1.sender)

    val message2 = Message("a@b.c", "b@c.d", "nani")
    val message3 = Message("a@b.c", "b@c.d", "nani")
    val messageAreTheSame = message2 == message3
    println(messageAreTheSame)

    val message4 = Message("a@b.c", "b@c.d", "nani")
    val message5 = message4.copy(sender = message4.recipient, recipient = "nani@naver.com")
    println(message5.sender)
    println(message5.recipient)
    println(message5.body)
  }
}
