package com.francisco.foobarqix;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberTest {
  @Test
  public void returnsTrueWhenTheNumberIsDivisibleByTheGivenValue() {
    Number number = new Number("3");
    assertTrue(number.isDivisibleBy(3));
  }

  @Test
  public void returnsFalseWhenTheNumberIsNotDivisibleByAnyOfTheGivenValues() {
    Number number = new Number("32");
    assertFalse(number.isDivisibleByAnyOf(3, 5, 7));
  }

  @Test
  public void returnsTrueWhenTheNumberIsDivisibleByAtLeastOneOfTheGivenValues() {
    Number number = new Number("9");
    assertTrue(number.isDivisibleByAnyOf(3, 5, 7));
  }
}