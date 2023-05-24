package lib

import lib.discountStrategy.{ApplesDiscountStrategy, DiscountStrategy, SoupBreadDealDiscountStrategy}

import scala.collection.mutable.{Map => MutableMap}

class PriceBasket {

  private val groceriesPrices: Map[String, Double] = Map(
    "Soup" -> 0.65,
    "Bread" -> 0.80,
    "Milk" -> 1.30,
    "Apples" -> 1.00
  )

  val discountStrategies: Map[String, DiscountStrategy] = Map(
    "Apples" -> new ApplesDiscountStrategy(),
    "SoupBreadDeal" -> new SoupBreadDealDiscountStrategy()
  )

  // TODO: testing
  def calculatePrice(basket: List[String]): List[Any] = {
    val itemCounts = calculateItemCount(basket)
    val subtotal = calculateSubtotal(itemCounts)
    println(s"Subtotal: £${formatPrice(subtotal)}")

    val discountCalculator = new DiscountCalculator(discountStrategies)
    val offerDiscounts: Double = discountCalculator.calculateDiscountAmount(itemCounts, groceriesPrices)
    val totalPrice = subtotal - offerDiscounts


    if (offerDiscounts > 0) {
      println(s"Special offer discounts: £${formatPrice(offerDiscounts)}")
    } else
      println("(No offers available)")
    println(s"Total price: £${formatPrice(totalPrice)}")

    List (formatPrice(subtotal), formatPrice(offerDiscounts), formatPrice(totalPrice))
  }

  def calculateItemCount(basket: List[String]): Map[String, Int] = {
    val basketItemCount: Map[String, Int] = basket.groupBy(identity).mapValues(_.size)
    basketItemCount
  }

  def calculateSubtotal(itemCounts: Map[String, Int]): Double = {
    itemCounts.foldLeft(0.0) { case (subtotal, (item, count)) =>
      subtotal + groceriesPrices.getOrElse(item, 0.0) * count
    }
  }

  def formatPrice(price: Double): String = {
    // format to float and keep 2 decimal place
    f"$price%.2f"
  }

}
  // input may like: apples: 2 Soup: 2 Bread 1
object PriceBasket {
  def main(args: Array[String]): Unit = {
    //
//    var args = Array[String]("Soup", "Apples", "Apples", "Bread", "Soup")
    var args = Array[String]("Soup", "Apples", "Apples", "Bread", "Soup")
    // val items = args.toList.tail
    val items = args.toList
    val basket = new PriceBasket
    basket.calculatePrice(items)
  }
}
