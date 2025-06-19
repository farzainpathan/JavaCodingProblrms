package com.java.coding.problems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MergerIntervalTest {

  @Test
  @Order(1)
  @DisplayName("Merge overlapping intervals")
  public void test_1() {
    // Given
    List<Interval> intervalList = getIntervals();
    // When
    List<Interval> result = MergeIntervals.doMerge(intervalList);
    // Then
    assertThat(result).isEqualTo(expectedIntervals());
  }

  private List<Interval> getIntervals() {
    return Arrays.asList(
        new Interval(1, 3), new Interval(8, 10), new Interval(2, 6), new Interval(15, 18));
  }

  private List<Interval> expectedIntervals() {
    return Arrays.asList(new Interval(1, 6), new Interval(8, 10), new Interval(15, 18));
  }
}
