package com.francisco.foobarqix;

public class Number {
  private String number;
  private int numberValue;

  Number(String number) {
    this.number = number;
    this.numberValue = Integer.valueOf(number);
  }

  public boolean isDivisibleByAnyOf(int ...values) {
    for (int value : values) {
      if (isDivisibleBy(value)) {
        return true;
      }
    }
    return false;
  }

  boolean isDivisibleBy(int value) {
    return 0 == numberValue % value;
  }

  int value() {
    return numberValue;
  }

  char[] digits() {
    return number.toCharArray();
  }
}
