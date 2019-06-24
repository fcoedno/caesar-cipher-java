package com.francisco.kata.potter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BasketTest {
  private Basket basket;

  @Before
  public void setUpBasket() {
    basket = new Basket();
  }

  @Test
  public void addsABookMultipleTimes() {
    basket.add(Book.firstVolume(), 5);
    assertEquals(5, basket.quantity());
  }

  @Test
  public void countsTheNumberOfUniqueVolumes() {
    basket.add(Book.firstVolume(), 3).add(Book.secondVolume(), 7);
    assertEquals(2, basket.uniqueVolumes());
  }
}
