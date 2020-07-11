package traits.subtyping

import scala.collection.mutable.ArrayBuffer

object SubtypingObject {
  def main(args: Array[String]): Unit = {
    val dog = new Dog("Harry")
    val cat = new Cat("Sally")

    val animals = ArrayBuffer.empty[Pet]
    animals.append(dog)
    animals.append(cat)
    animals.foreach(pet => println(pet.name))
  }
}
