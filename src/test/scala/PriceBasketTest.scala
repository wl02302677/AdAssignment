import lib.PriceBasket

class PriceBasketTest {

  def testCalculatePrice(items: List[String], subtotal: Double, discounts: Double, price: Double): Unit = {
    val basket = new PriceBasket
    val testList = basket.calculatePrice(items)
    if (testList.head != formatPrice(subtotal)){
        println("subtotal wrong value")
    }else if (testList(1)!= formatPrice(discounts)){
      println("discounts wrong value")
    }else if (testList(2) != formatPrice(price)){
      println("price wrong value")
    }else{
      println("pass testing")
    }
  }

  def formatPrice(price: Double): String = {
    // format to float and keep 2 decimal place
    f"$price%.2f"
  }
}

object PriceBasketTest {
  def main(args: Array[String]): Unit = {
    var test1 = List[String]("Soup", "Apples", "Apples", "Bread", "Soup")
    var test2 = List[String]("Apples", "Apples", "Milk", "Bread")
    var test3 = List[String]("Soup", "Bread", "Soup", "Bread")
    var test4 = List[String]("Soup", "Bread", "Soup", "Bread", "Soup", "Soup")

    var subtotal1: Double = 4.10
    var discounts1: Double = 0.60
    var price1: Double = 3.50

    var subtotal2: Double = 4.10
    var discounts2: Double = 0.20
    var price2: Double = 3.90

    var subtotal3: Double = 2.90
    var discounts3: Double = 0.40
    var price3: Double = 2.50

    var subtotal4: Double = 4.20
    var discounts4: Double = 0.80
    var price4: Double = 3.40

    // val items = args.toList.tail
    val test = new PriceBasketTest
    println("---------------------start test1 ---------------------")
    test.testCalculatePrice(test1, subtotal1, discounts1, price1)
    println("---------------------start test2 ---------------------")
    test.testCalculatePrice(test2, subtotal2, discounts2, price2)
    println("---------------------start test3 ---------------------")
    test.testCalculatePrice(test3, subtotal3, discounts3, price3)
    println("---------------------start test4 ---------------------")
    test.testCalculatePrice(test4, subtotal4, discounts4, price4)
  }
}
