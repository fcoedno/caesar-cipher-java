package com.francisco.caesar;

public class CaesarCipherEncoder {

  private Alphabet alphabet;

  CaesarCipherEncoder(Alphabet alphabet) {
    this.alphabet = alphabet;
  }

  String encode(String plaintext, int shift) {
    StringBuilder ciphertext = new StringBuilder();
    for (Character character : plaintext.toCharArray()) {
      ciphertext.append(alphabet.shiftedCharacter(character, shift));
    }
    return ciphertext.toString();
  }
}
