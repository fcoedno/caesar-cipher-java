package com.francisco.kata.potter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PotterPricingCalculatorTest {
  private PotterPricingCalculator pricingCalculator = new PotterPricingCalculator();
  private Basket basket;

  @Before
  public void setUpBasket() {
    basket = new Basket();
  }

  @Test
  public void calculatesThePriceForABasketWithASingleBook() {
    basket.add(Book.firstVolume());

    assertEquals(8.0, pricingCalculator.calculate(basket), 0.0);
  }

  @Test
  public void calculatesThePriceForABasketWithBooksOfTheSameVolume() {
    basket.add(Book.firstVolume(), 5);
    assertEquals(40.0, pricingCalculator.calculate(basket), 0.0);
  }

  @Test
  public void appliesAFivePercentDiscountForABasketWithTwoDifferentVolumes() {
    basket.add(Book.firstVolume()).add(Book.secondVolume());
    assertEquals(15.2, pricingCalculator.calculate(basket), 0.0);
  }

  @Test
  public void appliesATenPercentDiscountForABasketWithThreeDifferentVolumes() {
    basket.add(Book.firstVolume()).add(Book.secondVolume()).add(Book.thirdVolume());
    assertEquals(21.6, pricingCalculator.calculate(basket), 0.0);
  }

  @Test
  public void appliesATwentyPercentDiscountForABasketWithFourDifferentVolumes() {
    basket
        .add(Book.firstVolume())
        .add(Book.secondVolume())
        .add(Book.thirdVolume())
        .add(Book.fourthVolume());
    assertEquals(25.6, pricingCalculator.calculate(basket), 0.0);
  }

  @Test
  public void appliesATwentyFivePercentDiscountForABasketWithFiveDifferentVolumes() {
    basket
        .add(Book.firstVolume())
        .add(Book.secondVolume())
        .add(Book.thirdVolume())
        .add(Book.fourthVolume())
        .add(Book.fifthVolume());
    assertEquals(30, pricingCalculator.calculate(basket), 0.0);
  }

  @Test
  public void composesTheDiscountForMixedBaskets() {
    basket
        .add(Book.firstVolume(), 2)
        .add(Book.secondVolume(), 2)
        .add(Book.thirdVolume());
    assertEquals(36.8, pricingCalculator.calculate(basket), 0.0);
  }
}
