package com.rflpazini.playground;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RotateArrayTest {

  private RotateArray target;

  @Before
  public void init() {
    this.target = new RotateArray();
  }

  @Test
  public void shouldRotateArray() {
    // given
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;

    // when
    int[] rotated = target.rotate(nums, k);
    int[] expected = {5, 6, 7, 1, 2, 3, 4};

    Assert.assertArrayEquals(expected, rotated);
  }
}