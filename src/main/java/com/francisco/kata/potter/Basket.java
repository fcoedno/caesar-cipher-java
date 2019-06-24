package com.francisco.kata.potter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Basket {
  private List<Book> bookList = new ArrayList<>();

  Basket add(Book book) {
    return add(book, 1);
  }

  Basket add(Book book, int quantity) {
    for (int i = 0; i < quantity; i++) {
      bookList.add(book);
    }
    return this;
  }

  Book remove(int volume) {
    Book found = null;
    for (Book book : bookList) {
      if (volume == book.getVolume()) {
        found = book;
        break;
      }
    }
    bookList.remove(found);
    return found;
  }

  public int quantity() {
    return bookList.size();
  }

  public int uniqueVolumes() {
    Set<Book> set = new LinkedHashSet<>(bookList);
    return set.size();
  }
}
