package com.rflpazini.playground;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.com.rflpazini.playground.utils.Fixtures;

public class ArraysTest {

  private Arrays target;

  @Before
  public void init() {
    this.target = new Arrays();
  }

  @Test
  public void shouldAddNewFirstPosition() {
    // given
    int[] grid = Fixtures.SIMPLE_ARRAY;
    int polePosition = 1;

    // when
    int[] actual = target.insertPolePosition(polePosition, grid);

    // then
    Assert.assertEquals(polePosition, actual[0]);
  }

  @Test
  public void shouldCheckSum_ofTwoNumbers() {
    // given
    int[] nums = {2,7,11,15};
    int sum = 9;

    // when
    int[] actual = target.twoSum(nums, sum);

    // then
    int[] expected = {0,1};
    Assert.assertArrayEquals(expected, actual);
  }


}
