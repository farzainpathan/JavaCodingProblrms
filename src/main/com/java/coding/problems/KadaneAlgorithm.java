package com.java.coding.problems;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;

public class KadaneAlgorithm {

  public Integer maxSubArraySum(List<Integer> inputList) {

    Integer first = inputList.getFirst();
    Integer last = inputList.getFirst();

    for (int i = 1; i < inputList.size(); i++) {
      last = max(last + inputList.get(i), inputList.get(i));
      first = max(first, last);
    }

    return first;
  }

  public List<Integer> maxSumSubArrayElements(List<Integer> inputList) {

    int resStart = 0, resEnd = 0;
    int maxSum = inputList.getFirst();

    for (int i = 0; i < inputList.size(); i++) {
      int currSum = 0;
      for (int j = i; j < inputList.size(); j++) {

        currSum += inputList.get(j);

        if (currSum > maxSum) {
          maxSum = currSum;
          resStart = i;
          resEnd = j;
        }
      }
    }

    List<Integer> res = new ArrayList<>();
    for (int i = resStart; i <= resEnd; i++) res.add(inputList.get(i));
    return res;
  }
}
