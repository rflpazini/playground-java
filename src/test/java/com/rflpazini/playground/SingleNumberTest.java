package com.rflpazini.playground;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleNumberTest {

  private SingleNumber target;

  @Test
  public void shouldReturnOnlySingleNumber() {
    // given
    int[] nums = {2, 2, 1};
    target = new SingleNumber();

    // when
    int actual = target.singleNumber(nums);

    // then
    assertEquals(1, actual);
  }

  @Test
  public void shouldReturnOnlySingleNumber_fromADifferentArray() {
    // given
    int[] nums = {4, 1, 2, 1, 2};
    target = new SingleNumber();

    // when
    int actual = target.singleNumber(nums);

    // then
    assertEquals(4, actual);
  }

}
