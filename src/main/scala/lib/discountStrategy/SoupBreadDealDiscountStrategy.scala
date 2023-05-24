package lib.discountStrategy

class SoupBreadDealDiscountStrategy extends DiscountStrategy {
  def calculateDiscount(basketItemCount: Map[String, Int], itemPrices: Map[String, Double]): Double = {
    val soupCount: Int = basketItemCount.getOrElse("Soup", 0)
    val breadCount: Int = basketItemCount.getOrElse("Bread", 0)

    val requiredSoupCount: Int = 2 //When buy 2 soup and bread
    val requiredBreadPrice: Double = 0.5 //Bread discount 50%

    val eligibleDeals: Int = Math.min(soupCount / requiredSoupCount, breadCount)
    eligibleDeals * requiredBreadPrice
  }
}
