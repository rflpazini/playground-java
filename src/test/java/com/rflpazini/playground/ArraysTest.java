package com.rflpazini.playground;

import org.junit.Assert;
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
    Assert.assertEquals(polePosition, actual[0]);
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
    Assert.assertArrayEquals(expected, actual);
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
    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldSumThree() {
    // given
    int[] nums = {-1, 0, 1, 2, -1, -4};
    int sum = 6;

    // when
    List<List<Integer>> actual = target.threeSum(nums);

    // then
    List<List<Integer>> expected = List.of(
        List.of(-1, 1, 0),
        List.of(-1, 2, -1)
    );

    Assert.assertEquals(expected, actual);
  }

}
