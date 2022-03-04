package com.rflpazini.playground;

import org.junit.Assert;
import org.junit.Test;

public class ReverseNumbersTest {

  @Test
  public void shouldReturnReversedNumber() {
    // given
    int givenNumber = 123456789;

    // when
    ReverseNumbers target = new ReverseNumbers();
    int actual = target.execute(givenNumber);

    // then
    Assert.assertEquals(987654321, actual);
  }

  @Test
  public void shouldReturnOtherReversedNumber() {
    // given
    int givenNumber = 387512;

    // when
    ReverseNumbers target = new ReverseNumbers();
    int actual = target.execute(givenNumber);

    // then
    Assert.assertEquals(215783, actual);
  }

  @Test
  public void shouldReturnReversedNumber_() {
    // given
    int givenNumber = 1534236469;

    // when
    ReverseNumbers target = new ReverseNumbers();
    int actual = target.execute(givenNumber);

    // then
    Assert.assertEquals(0, actual);
  }
}
