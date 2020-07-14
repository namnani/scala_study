package high.order.functions

object MapObject {
  def main(args: Array[String]): Unit = {
    var salaries = Seq(20000, 70000, 40000)
    val doubleSalary = (x: Int) => x * 2
    var newSalaries = salaries.map(doubleSalary)
    println(newSalaries)

    salaries = Seq(3, 6, 9)
    newSalaries = salaries.map(x => x * 3)
    println(newSalaries)

    salaries = Seq(1,2,3)
    newSalaries = salaries.map(_ * 2)
    println(newSalaries)
  }
}
