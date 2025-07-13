package com.java.coding.problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Node {
  protected Integer key;
  protected Integer value;

  Node(Integer key, Integer value) {
    this.key = key;
    this.value = value;
  }
}

class LruCache {
  private final Integer capacity;
  private final LinkedList<Node> lruList = new LinkedList<>();
  private final Map<Integer, Node> lruCache = new HashMap<>();

  private LruCache(Integer capacity) {
    this.capacity = capacity;
  }

  public static LruCache withCapacity(Integer capacity) {
    return new LruCache(capacity);
  }

  public Integer get(Integer key) {
    if (lruCache.containsKey(key)) {
      Node node = lruCache.get(key);
      lruList.remove(node);
      lruList.addFirst(node);
      return node.value;
    }
    return -1;
  }

  public void put(Integer key, Integer value) {
    if (lruCache.containsKey(key)) {
      Node node = lruCache.get(key);
      lruList.remove(node);
      node.value = value;
      lruList.addFirst(node);
    } else {
      if (lruCache.size() >= capacity) {
        Node node = lruList.removeLast();
        lruCache.remove(node.key);
      }
      Node node = new Node(key, value);
      lruList.addFirst(node);
      lruCache.put(key, node);
    }
  }
}
