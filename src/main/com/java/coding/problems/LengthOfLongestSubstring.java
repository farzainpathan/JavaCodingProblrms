package com.java.coding.problems;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.max;

public class LengthOfLongestSubstring {
  public Integer longestSubstring(String input) {
    Set<Character> charSet = new HashSet<>();
    int maxLength = 0;
    int left = 0;

    for (int right = 0; right < input.length(); right++) {

      while (charSet.contains(input.charAt(right))) {
        charSet.remove(input.charAt(left));
        left++;
      }

      charSet.add(input.charAt(right));
      maxLength = max(maxLength, right - left + 1);
    }

    return maxLength;
  }
}
