package com.java.coding.problems;

import java.util.*;

import static java.lang.Math.max;

public class MergeIntervals {

  public static List<Interval> doMerge(List<Interval> intervals) {

    List<Interval> merged = new ArrayList<>();

    intervals.sort(Comparator.comparingInt(Interval::getStart));
    merged.add(intervals.getFirst());

    intervals.forEach(
        interval -> {
          Interval lastMerged = merged.get(merged.size() - 1);

          if (interval.getStart() <= lastMerged.getEnd())
            lastMerged.setEnd(max(interval.getEnd(), lastMerged.getEnd()));
          else merged.add(interval);
        });

    return merged;
  }
}

class Interval {
  private Integer start;
  private Integer end;

  public Interval(Integer start, Integer end) {
    this.start = start;
    this.end = end;
  }

  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  @Override
  public String toString() {
    return "Interval{" + "start=" + start + ", end=" + end + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Interval interval = (Interval) o;
    return Objects.equals(start, interval.start) && Objects.equals(end, interval.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }
}
