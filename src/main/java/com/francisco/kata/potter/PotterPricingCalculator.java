package com.francisco.kata.potter;

import java.util.ArrayList;
import java.util.List;

public class PotterPricingCalculator {
  double calculate(Basket basket) {
    double sum = 0.0;
    for (Basket uniqueBasket : uniqueBasketsFrom(basket)) {
      sum += calculateForUniqueBasket(uniqueBasket);
    }
    return sum;
  }

  /**
   * Returns a list of Baskets containing only non-repeated books
   *
   * @param Basket basket
   * @return The list of unique baskets
   */
  private List<Basket> uniqueBasketsFrom(Basket basket) {
    List<Basket> baskets = new ArrayList<>();
    while (basket.quantity() > 0) {
      Basket newBasket = new Basket();
      for (int volume = 1; volume <= 5; volume++) {
        Book aBook = basket.remove(volume);
        if (null != aBook) {
          newBasket.add(aBook);
        }
      }
      baskets.add(newBasket);
    }
    return baskets;
  }

  /**
   * Calculates the price for a basket containing only non-repeated books
   *
   * @param Basket basket
   * @return The price for that basket
   */
  private double calculateForUniqueBasket(Basket basket) {
    double totalValue = 8.0 * basket.quantity();
    double totalDiscount = calculateDiscount(basket);

    return totalValue * (1 - totalDiscount / 100);
  }

  private double calculateDiscount(Basket basket) {
    switch (basket.uniqueVolumes()) {
      case 2:
        return 5;
      case 3:
        return 10;
      case 4:
        return 20;
      case 5:
        return 25;
      default:
        return 0;
    }
  }
}
