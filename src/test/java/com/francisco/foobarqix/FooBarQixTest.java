package com.francisco.foobarqix;

import static org.junit.Assert.*;

import org.junit.Test;

public class FooBarQixTest {
  FooBarQix fooBarQix = new FooBarQix();

  @Test
  public void returnsTheSameNumberWhenNot3Nor5Nor7() {
    assertEquals("1", fooBarQix.compute("1"));
  }

  @Test
  public void returnsFooWhenTheNumberIsDivisibleBy3() {
    assertEquals("Foo", fooBarQix.compute("9"));
  }

  @Test
  public void returnsBarWhenTheNumberIsDivisibleBy5() {
    assertEquals("Bar", fooBarQix.compute("10"));
  }

  @Test
  public void returnsQixWhenTheNumberIsDivisibleBy7() {
    assertEquals("Qix", fooBarQix.compute("49"));
  }

  @Test
  public void returnsFooQixWhenTheNumberIsDivisibleByBoth3And7() {
    assertEquals("FooQix", fooBarQix.compute("21"));
  }
}