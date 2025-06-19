package com.java.coding.problems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class FirstUniqueCharacterTest {

  @Test
  @Order(1)
  @DisplayName("Find the first unique character")
  public void test_1() {
    // Given
    FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
    String input = "farzain";
    // When
    List<Character> result = firstUniqueCharacter.firstUniqueElement(input);
    // Then
    assertThat(result).isEqualTo(List.of('f'));
  }

  @Test
  @Order(1)
  @DisplayName("Find the index of first unique character")
  public void test_2() {
    // Given
    FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
    String input = "farzain";
    // When
    List<Integer> result = firstUniqueCharacter.firstUniqueElementIndex(input);
    // Then
    assertThat(result).isEqualTo(List.of(1));
  }
}
