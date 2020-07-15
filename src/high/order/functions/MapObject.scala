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

    salaries = Seq(1, 2, 3)
    newSalaries = salaries.map(_ * 2)
    println(newSalaries)

    val domainName = "www.example.com"
    def getURL = urlBuilder(ssl=true, domainName)
    val endpoint = "users"
    val query = "id=1"
    val url = getURL(endpoint, query)
    println(url)
  }

  private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] =
    salaries.map(promotionFunction)

  def smallPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * salary)

  def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  }
}
