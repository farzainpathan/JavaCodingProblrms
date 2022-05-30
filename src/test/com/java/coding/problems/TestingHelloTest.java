package com.java.coding.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestingHelloTest {

  @Test
  @DisplayName("Find next greater number with same set of digits")
  @Order(1)
  public void test() {
    TestingHello testingHello = new TestingHello();
    System.out.println(testingHello.helloWorld());
    assertThat(testingHello.helloWorld()).isEqualTo("Testing the setup with hello world");
  }
}
