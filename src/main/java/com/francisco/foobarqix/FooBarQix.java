package com.francisco.foobarqix;

public class FooBarQix {
  String compute(String number)  {
    int value = Integer.valueOf(number);
    StringBuilder computedValue = new StringBuilder();

    if (0 != value % 3 && 0 != value % 5 && 0 != value % 7) {
      return number;
    }

    if (0 == value % 3) {
      computedValue.append("Foo");
    }

    if (0 == value % 5) {
      computedValue.append("Bar");
    }

    if (0 == value % 7) {
      computedValue.append("Qix");
    }

    return computedValue.toString();
  }
}
