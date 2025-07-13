package com.java.coding.problems;

import static java.lang.Math.max;
import static java.lang.Math.min;

import java.util.List;

public class ContainerWithMostWater {
  public Integer maxWater(List<Integer> inputList) {

    int left = 0;
    int right = inputList.size() - 1;
    int res = 0;

    while (left < right) {
      int water = min(inputList.get(left), inputList.get(right)) * (right - left);
      res = max(res, water);

      if (inputList.get(left) < inputList.get(right)) left += 1;
      else right -= 1;
    }
    return res;
  }
}
