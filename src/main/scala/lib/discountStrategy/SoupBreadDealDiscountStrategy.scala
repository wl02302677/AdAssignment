package lib.discountStrategy

class SoupBreadDealDiscountStrategy extends DiscountStrategy {
  def calculateDiscount(basketItemCount: Map[String, Int], itemPrices: Map[String, Double]): Double = {
    val breadPrice = itemPrices("Bread")
    val soupCount: Int = basketItemCount.getOrElse("Soup", 0)
    val breadCount: Int = basketItemCount.getOrElse("Bread", 0)

    val requiredSoupCount: Int = 2 //When buy 2 soup and bread
    val breadDiscount: Double = 0.5 * breadPrice //Bread discount 50%

    val eligibleDeals: Int = Math.min(soupCount / requiredSoupCount, breadCount)
    eligibleDeals * breadDiscount
  }
}
