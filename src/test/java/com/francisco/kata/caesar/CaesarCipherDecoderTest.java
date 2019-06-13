package com.francisco.kata.caesar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaesarCipherDecoderTest {
  private CaesarCipherDecoder decoder = new CaesarCipherDecoder(Alphabet.latin());

  @Test
  public void decodesASimpleCharacter() {
    String decodedText = decoder.decode("e", 3);
    assertEquals("b", decodedText);
  }

  @Test
  public void decodesTheFirstCharacterOfTheAlphabet() {
    String decodedText = decoder.decode("a", 7);
    assertEquals("t", decodedText);
  }

  @Test
  public void ignoresNonAlphabetCharacters() {
    String decodedText = decoder.decode(" ", 7);
    assertEquals(" ", decodedText);
  }

  @Test
  public void decodesAText() {
    String ciphertext = "wxb jvjvxb yxazdn nun wxb jvxd yarvnrax";
    assertEquals("nos amamos porque ele nos amou primeiro", decoder.decode(ciphertext, 9));
  }
}
