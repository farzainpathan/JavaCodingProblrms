package com.java.coding.problems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

  @Test
  @Order(1)
  @DisplayName("Find the maximum amount of water that can be contained between any two lines")
  public void test_1() {
    // Given
    ContainerWithMostWater mostWater = new ContainerWithMostWater();
    List<Integer> inputList = Arrays.asList(2, 1, 8, 6, 4, 6, 5, 5);
    // When
    Integer result = mostWater.maxWater(inputList);
    // Then
    assertThat(result).isEqualTo(25);
  }
}
