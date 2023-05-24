package lib

import lib.discountStrategy.DiscountStrategy

class DiscountCalculator(discountStrategies: Map[String, DiscountStrategy]) {
  def calculateDiscountAmount(basketItemCount: Map[String, Int], itemPrices: Map[String, Double]): Double = {
    discountStrategies.values.map(_.calculateDiscount(basketItemCount, itemPrices)).sum
  }

}
