package lib.discountStrategy

trait DiscountStrategy {
  def calculateDiscount(basketItemCount: Map[String, Int], itemPrices: Map[String, Double]): Double
}
