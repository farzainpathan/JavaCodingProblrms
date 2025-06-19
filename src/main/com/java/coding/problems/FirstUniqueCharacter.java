package com.java.coding.problems;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstUniqueCharacter {

  public List<Character> firstUniqueElement(String input) {

    Map<Character, Integer> map = new LinkedHashMap<>();

    for (int i = 0; i < input.length(); i++) {
      if (map.containsKey(input.charAt(i))) {
        map.put(input.charAt(i), map.get(input.charAt(i) + 1));
      } else {
        map.put(input.charAt(i), 1);
      }
    }

    return List.of(
        map.entrySet().stream()
            .filter(entry -> entry.getValue().equals(1))
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse('0'));
  }


  public List<Integer> firstUniqueElementIndex(String input) {

    Map<Character, Integer> map = new LinkedHashMap<>();

    for (int i = 0; i < input.length(); i++) {
      if (map.containsKey(input.charAt(i))) {
        map.put(input.charAt(i), -1);
      } else {
        map.put(input.charAt(i), 1);
      }
    }

    return List.of(
        map.entrySet().stream()
            .filter(entry -> !entry.getValue().equals(-1))
            .findFirst()
            .map(Map.Entry::getValue)
            .orElse(-1));
  }
}
