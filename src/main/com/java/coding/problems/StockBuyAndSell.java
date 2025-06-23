package com.java.coding.problems;

import java.util.List;

public class StockBuyAndSell {

  public Integer maxProfit(List<Integer> prices) {

    Integer minBuy = prices.getFirst();
    int maxProfit = 0;

    for (int i = 1; i < prices.size(); i++) {
      minBuy = Math.min(minBuy, prices.get(i));
      maxProfit = Math.max(maxProfit, prices.get(i) - minBuy);
    }
    return maxProfit;
  }
}
