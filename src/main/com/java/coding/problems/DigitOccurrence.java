package com.java.coding.problems;


import java.util.*;

public class DigitOccurrence {

  public List<Integer> countDigitOccurrence(List<Integer> inputList) {
    List<Integer> digitList = new ArrayList<>();
    Map<Integer, Integer> count = new HashMap<>();

    inputList.forEach(
        digit -> {
          List<Integer> dList = convertToDigits(digit);
          digitList.addAll(dList);
        });

    digitList.forEach(
        digit -> {
          if (count.containsKey(digit)) {
            count.put(digit, count.get(digit) + 1);
          } else {
            count.put(digit, 1);
          }
        });

    Map<Integer, Integer> resultMap = sortMap(count);

    return findMostOccurrenceDigits(resultMap);
  }

  private List<Integer> findMostOccurrenceDigits(Map<Integer, Integer> resultMap) {

    List<Integer> resultList = new ArrayList<>();
    int maxValueInMap = (Collections.max(resultMap.values()));

    for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
      if (entry.getValue().equals(maxValueInMap)) {
        resultList.add(entry.getKey());
      }
    }
    return resultList;
  }

  private Map<Integer, Integer> sortMap(Map<Integer, Integer> unSortedMap) {

    LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();
    unSortedMap.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEachOrdered(value -> reverseSortedMap.put(value.getKey(), value.getValue()));
    return reverseSortedMap;
  }

  private List<Integer> convertToDigits(Integer digit) {

    List<Integer> result = new ArrayList<>();
    String sNumber = String.valueOf(digit);
    char[] charDigit = sNumber.toCharArray();
    for (char c : charDigit) {
      result.add(Character.getNumericValue(c));
    }
    return result;
  }
}
