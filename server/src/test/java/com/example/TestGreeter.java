package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetTest() {
    String result = greeter.greet("abdo");
    String expected = "Hello, abdo!";
    assertEquals(expected, result);
  }

}
