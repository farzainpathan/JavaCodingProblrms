package com.java.coding.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

public class DigitOccurrenceTest {

  @Test
  @Order(1)
  @DisplayName("Count the digit in given array")
  public void test_1() {
    // Given
    DigitOccurrence digitOccurrence = new DigitOccurrence();
    List<Integer> inputList = Arrays.asList(1, 12, 2, 32, 41, 56, 998);
    // When
    List<Integer> result = digitOccurrence.countDigitOccurrence(inputList);
    // Then
    assertThat(result).isEqualTo(Arrays.asList(1, 2));
  }

  @Test
  @Order(2)
  @DisplayName("Count the digit in given array")
  public void test_2() {
    // Given
    DigitOccurrence digitOccurrence = new DigitOccurrence();
    List<Integer> inputList = Arrays.asList(22, 23, 56, 34, 567, 90, 54, 3);
    // When
    List<Integer> result = digitOccurrence.countDigitOccurrence(inputList);
    // Then
    assertThat(result).isEqualTo(Arrays.asList(2, 3, 5));
  }
}
