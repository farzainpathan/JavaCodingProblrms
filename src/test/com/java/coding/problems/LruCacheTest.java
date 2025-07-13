package com.java.coding.problems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class LruCacheTest {
  // Example 1:
  // Input
  // ["LRUCache", "put", "put",   "get",  "put",  "get",  "put",    "get",  "get",  "get"]
  // [[2],        [1, 1], [2, 2],  [1],   [3, 3],  [2],    [4, 4],   [1],    [3],   [4]]
  // Output
  // [null, null, null, 1, null, -1, null, -1, 3, 4]
  @Test
  @Order(1)
  @DisplayName("LRU cache")
  public void test_1() {
    // Given
    LruCache lruCache = LruCache.withCapacity(2);
    // When & Then
    lruCache.put(1, 1);
    lruCache.put(2, 2);
    assertThat(lruCache.get(1)).isEqualTo(1);
    lruCache.put(3, 3);
    assertThat(lruCache.get(2)).isEqualTo(-1);
    lruCache.put(4, 4);
    assertThat(lruCache.get(1)).isEqualTo(-1);
    assertThat(lruCache.get(3)).isEqualTo(3);
    assertThat(lruCache.get(4)).isEqualTo(4);
  }
}
