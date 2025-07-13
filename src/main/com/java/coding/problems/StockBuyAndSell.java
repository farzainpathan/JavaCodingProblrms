package com.java.coding.problems;

import static java.lang.Math.max;
import static java.lang.Math.min;

import java.util.List;

public class StockBuyAndSell {

  public Integer maxProfit(List<Integer> prices) {

    Integer minBuy = prices.getFirst();
    int maxProfit = 0;

    for (int i = 1; i < prices.size(); i++) {
      minBuy = min(minBuy, prices.get(i));
      maxProfit = max(maxProfit, prices.get(i) - minBuy);
    }
    return maxProfit;
  }
}
