package com.francisco.caesar;

public class Alphabet {
  private String alphabet;

  private Alphabet(String alphabetChars) {
    alphabet = alphabetChars;
  }

  public static Alphabet latin() {
    return new Alphabet("abcdefghijklmnopqrstuvwxyz");
  }

  public Character shiftedCharacter(Character character, int shift) {
    int index = alphabet.indexOf(character);
    if (-1 == index) {
      return character;
    }
    return alphabet.charAt(Math.floorMod(index + shift, alphabet.length()));
  }
}
