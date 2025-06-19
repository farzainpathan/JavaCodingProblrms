package com.java.coding.problems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class KadaneAlgorithmTest {

  @Test
  @Order(1)
  @DisplayName("Find the subarray that has the maximum sum and return its sum")
  public void test_1() {
    // Given
    KadaneAlgorithm kadaneAlgorithm = new KadaneAlgorithm();
    List<Integer> inputList = Arrays.asList(2, 3, -8, 7, -1, 2, 3);
    // When
    Integer result = kadaneAlgorithm.maxSubArraySum(inputList);
    // Then
    assertThat(result).isEqualTo(11);
  }

  @Test
  @Order(1)
  @DisplayName("Find the subarray that has the maximum sum and return the elements")
  public void test_2() {
    // Given
    KadaneAlgorithm kadaneAlgorithm = new KadaneAlgorithm();
    List<Integer> inputList = Arrays.asList(2, 3, -8, 7, -1, 2, 3);
    // When
    List<Integer> result = kadaneAlgorithm.maxSumSubArrayElements(inputList);
    // Then
    assertThat(result).isEqualTo(List.of(7, -1, 2, 3));
  }
}
