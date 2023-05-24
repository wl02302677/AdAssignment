package lib.discountStrategy

class ApplesDiscountStrategy extends DiscountStrategy{
  def calculateDiscount(basketItemCount: Map[String, Int], itemPrices: Map[String, Double]): Double = {
    val appleCount: Int = basketItemCount.getOrElse("Apples", 0)
    val appleDiscountPercent: Double = 0.1 // apple discount 10%
    appleCount * itemPrices("Apples") * appleDiscountPercent
  }
}
