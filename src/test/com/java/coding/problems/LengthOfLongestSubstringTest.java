package com.java.coding.problems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class LengthOfLongestSubstringTest {
  @Test
  @Order(1)
  @DisplayName("Find the length of longest substring")
  public void test_1() {
    // Given
    LengthOfLongestSubstring longestSubstring = new LengthOfLongestSubstring();
    String input = "pwwkewxpw";
    // When
    Integer result = longestSubstring.longestSubstring(input);
    // Then
    assertThat(result).isEqualTo(5);
  }
}
