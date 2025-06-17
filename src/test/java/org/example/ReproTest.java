package org.example;

public class ReproTest {
  @org.junit.jupiter.api.Test
  void repro() throws InstantiationException, IllegalAccessException {
    Object instance = Repro.repro(Object.class);
    org.junit.jupiter.api.Assertions.assertEquals("java.lang.Object",instance.getClass().getName());
  }


}
