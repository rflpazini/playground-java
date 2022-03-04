package com.rflpazini.playground;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortArraysTest {

  private SortArrays target;

  @Before
  public void init() {
    this.target = new SortArrays();
  }

  @Test
  public void sortedSquaresBest() {
    // given
    int[] nums = {-4, -1, 0, 3, 10};

    // when
    int[] actual = target.sortedSquaresBest(nums);

    // then
    int[] expected = {0, 1, 9, 16, 100};
    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void sortedSquaresWorst() {
    // given
    int[] nums = {-4, -1, 0, 3, 10};

    // when
    int[] actual = target.sortedSquares(nums);

    // then
    int[] expected = {0, 1, 9, 16, 100};
    Assert.assertArrayEquals(expected, actual);
  }
}