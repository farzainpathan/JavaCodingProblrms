package com.java.coding.problems;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SpiralMatrixTraversalTest {

  @Test
  @Order(1)
  @DisplayName("Matrix spiral traversal")
  public void test_1() {
    // Given
    SpiralMatrixTraversal spiralMatrix = new SpiralMatrixTraversal();
    Integer[][] input = {{4, 8, 5}, {16, 23, 42}, {50, 7, 1}};
    // When
    List<Integer> result = spiralMatrix.spiralOrder(input);
    // Then
    assertThat(result).isEqualTo(List.of(4, 8, 5, 42, 1, 7, 50, 16, 23));
  }

  @Test
  @Order(1)
  @DisplayName("Matrix spiral traversal")
  public void test_2() {
    // Given
    SpiralMatrixTraversal spiralMatrix = new SpiralMatrixTraversal();
    Integer[][] input = {{1, 4, 7, 10}, {2, 5, 8, 11}, {3, 6, 9, 12}};
    // When
    List<Integer> result = spiralMatrix.spiralOrder(input);
    // Then
    assertThat(result).isEqualTo(List.of(1, 4, 7, 10, 11, 12, 9, 6, 3, 2, 5, 8));
  }
}
