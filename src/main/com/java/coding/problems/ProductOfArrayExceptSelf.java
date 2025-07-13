package com.java.coding.problems;

public class ProductOfArrayExceptSelf {

  public Integer[] productExceptSelf(Integer[] nums) {
    Integer[] left = new Integer[nums.length];
    Integer[] right = new Integer[nums.length];
    Integer[] result = new Integer[nums.length];

    left[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      left[i] = left[i - 1] * nums[i - 1];
    }

    right[nums.length - 1] = 1;
    for (int i = nums.length - 2; i > -1; i--) {
      right[i] = right[i + 1] * nums[i + 1];
    }

    for (int i = 0; i < nums.length; i++) {
      result[i] = left[i] * right[i];
    }
    return result;
  }
}
