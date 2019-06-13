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

  char[] digits() {
    return number.toCharArray();
  }

  @Override
  public String toString() {
    return number;
  }

  public boolean hasAnyOf(char ...characters) {
    for (char character : characters) {
      if (0 <= number.indexOf(character)) {
        return true;
      }
    }

    return false;
  }
}
