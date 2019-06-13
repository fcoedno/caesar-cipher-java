package com.francisco.kata.caesar;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaesarCipherEncoderTest {
  CaesarCipherEncoder encoder = new CaesarCipherEncoder(Alphabet.latin());

  @Test
  public void encodesASimpleCharacter() {
    String plaintext = "a";
    String ciphertext = encoder.encode(plaintext, 7);
    assertEquals("h", ciphertext);
  }

  @Test
  public void encodesAFullText() {
    String plaintext = "the quick brown fox jumps over the lazy dog.";
    String ciphertext = encoder.encode(plaintext, 7);
    assertEquals("aol xbpjr iyvdu mve qbtwz vcly aol shgf kvn.", ciphertext);
  }
}
