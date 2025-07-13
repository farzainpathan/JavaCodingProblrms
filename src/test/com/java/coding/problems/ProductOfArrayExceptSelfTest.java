package com.java.coding.problems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ProductOfArrayExceptSelfTest {

  @Test
  @Order(1)
  @DisplayName("Word Ladder - Shortest Chain To Reach Target Word")
  public void test_2() {
    // Given
    ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
    Integer[] input = {10, 3, 5, 6, 2};
    // When
    Integer[] res = productOfArrayExceptSelf.productExceptSelf(input);
    // Then
    Integer[] expectedOutput = {180, 600, 360, 300, 900};
    assertThat(res).isEqualTo(expectedOutput);
  }
}
