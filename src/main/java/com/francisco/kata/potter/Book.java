package com.francisco.kata.potter;

public class Book {
  private int volume;

  private Book(int volume) {
    this.volume = volume;
  }

  public static Book firstVolume() {
    return new Book(1);
  }

  public static Book secondVolume() {
    return new Book(2);
  }

  public static Book thirdVolume() {
    return new Book(3);
  }

  public static Book fourthVolume() {
    return new Book(4);
  }

  public static Book fifthVolume() {
    return new Book(5);
  }

  public int getVolume() {
    return volume;
  }
}
