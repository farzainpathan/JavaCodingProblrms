package com.java.coding.problems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class WordLadderTest {

  @Test
  @Order(1)
  @DisplayName("Word Ladder - Shortest Chain To Reach Target Word")
  public void test() {
    // Given
    WordLadder wordLadder = new WordLadder();
    String start = "toon";
    String target = "plea";
    ArrayList<String> inputList =
        new ArrayList<>(Arrays.asList("poon", "plee", "same", "poie", "plie", "poin", "plea"));
    // When
    Integer result = wordLadder.wordLadder(inputList, start, target);
    // Then
    assertThat(result).isEqualTo(7);
  }
}
