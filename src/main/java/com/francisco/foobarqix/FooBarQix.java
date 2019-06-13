package com.francisco.foobarqix;

public class FooBarQix {
  String compute(String number) {
    return compute(new Number(number));
  }

  private String compute(Number number) {
    StringBuilder computedValue = new StringBuilder();

    if (number.isDivisibleByAnyOf(3, 5, 7)) {
      processValue(number, computedValue);
      processDigits(number, computedValue);
      return computedValue.toString();
    }

    if (!number.hasAnyOf('3', '5', '7')) {
      return number.toString();
    }

    processDigits(number, computedValue);
    return computedValue.toString();
  }

  private void processValue(Number number, StringBuilder computedValue) {
    if (number.isDivisibleBy(3)) {
      computedValue.append("Foo");
    }

    if (number.isDivisibleBy(5)) {
      computedValue.append("Bar");
    }

    if (number.isDivisibleBy(7)) {
      computedValue.append("Qix");
    }
  }

  private void processDigits(Number number, StringBuilder computedValue) {
    for (char digit : number.digits()) {
      if ('3' == digit) {
        computedValue.append("Foo");
        continue;
      }

      if ('5' == digit) {
        computedValue.append("Bar");
        continue;
      }

      if ('7' == digit) {
        computedValue.append("Qix");
      }
    }
  }
}
