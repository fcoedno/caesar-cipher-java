package com.francisco.caesar;

public class CaesarCipherDecoder {
  private Alphabet alphabet;

  CaesarCipherDecoder(Alphabet alphabet) {
    this.alphabet = alphabet;
  }

  String decode(String ciphertext, int shift) {
    StringBuilder decodedText = new StringBuilder();
    for (Character character : ciphertext.toCharArray()) {
      decodedText.append(alphabet.shiftedCharacter(character, -shift));
    }
    return decodedText.toString();
  }
}
