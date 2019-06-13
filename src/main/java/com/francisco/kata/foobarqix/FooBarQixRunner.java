package com.francisco.kata.foobarqix;

public class FooBarQixRunner {
  public static void main(String[] args) {
    String[] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "13", "15", "21", "33", "51", "53"};
    FooBarQix fooBarQix = new FooBarQix();

    for (String value : values) {
      System.out.printf("%s => %s\n", value, fooBarQix.compute(value));
    }
  }
}
