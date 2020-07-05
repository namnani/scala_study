import `object`.IdFactory

object IdFactoryObject extends App{
  val newId: Int = IdFactory.create()
  println(newId)
  val newerId: Int = IdFactory.create()
  println(newerId)
}
