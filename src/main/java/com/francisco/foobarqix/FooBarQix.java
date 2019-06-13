package com.francisco.foobarqix;

public class FooBarQix {
  String compute(String number)  {
    int value = Integer.valueOf(number);

    if (0 == value % 3) {
      return "Foo";
    }

    if (0 == value % 5) {
      return "Bar";
    }

    if (0 == value % 7) {
      return "Qix";
    }

    return number;
  }
}
