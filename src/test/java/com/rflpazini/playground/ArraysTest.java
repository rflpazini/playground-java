package com.rflpazini.playground;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;
import com.rflpazini.playground.utils.Fixtures;
import java.util.List;

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
    assertEquals(polePosition, actual[0]);
  }

  @Test
  public void shouldCheckSum_ofTwoNumbers() {
    // given
    int[] nums = {2, 7, 11, 15};
    int sum = 9;

    // when
    int[] actual = target.twoSum(nums, sum);

    // then
    int[] expected = {0, 1};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldCheckSum_ofTwoNumbers_withoutSort() {
    // given
    int[] nums = {3, 2, 4};
    int sum = 6;

    // when
    int[] actual = target.twoSum(nums, sum);

    // then
    int[] expected = {1, 2};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldSumThree() {
    // given
    int[] nums = {-1, 0, 1, 2, -1, -4};
    int sum = 6;

    // when
    List<List<Integer>> actual = target.threeSum(nums);

    // then
    List<List<Integer>> expected = List.of(List.of(-1, 1, 0), List.of(-1, 2, -1));

    assertEquals(expected, actual);
  }

  @Test
  public void shouldRotateArray() {
    // given
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;

    // when
    int[] rotated = target.rotate(nums, k);
    int[] expected = {5, 6, 7, 1, 2, 3, 4};

    assertArrayEquals(expected, rotated);
  }

  @Test
  public void shouldCountMaxAreaWithWater() {
    // given
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

    // when
    var actual = target.maxArea(height);

    // then
    assertEquals(49, actual);
  }

  @Test
  public void shouldMergeAll() {
    // given
    int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

    // when
    var actual = target.merge(intervals);

    // then
    var expected = new int[][]{{1, 6}, {8, 10}, {15, 18}};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldFindWeakestRowsOfSoldiers() {
    // given
    int[][] rows = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1}};

    int k = 3;

    // when
    var actual = target.kWeakestRows(rows, k);

    // then
    var expected = new int[]{2, 0, 3};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldFindNextGreater() {
    // given
    int[] nums1 = new int[]{4, 1, 2};
    int[] nums2 = new int[]{1, 3, 4, 2};

    // when
    var actual = target.nextGreaterElement(nums1, nums2);

    // then
    var expected = new int[]{-1, 3, -1};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldFindLastStoneWeight() {
    // given
    int[] stones = new int[]{2, 7, 4, 1, 8, 1};

    // when
    var actual = target.lastStoneWeight(stones);

    // then
    assertEquals(1, actual);
  }


}
