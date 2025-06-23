package com.java.coding.problems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StockBuyAndSellTest {

  @Test
  @Order(1)
  @DisplayName("Stock buy and sell")
  public void test() {
    // Given
    StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
    List<Integer> prices = new ArrayList<>(List.of(7, 10, 1, 3, 6, 9, 2));
    // When
    Integer result = stockBuyAndSell.maxProfit(prices);
    // Then
    assertThat(result).isEqualTo(8);
  }
}
