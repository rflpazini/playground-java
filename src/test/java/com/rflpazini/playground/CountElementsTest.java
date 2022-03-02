package com.rflpazini.playground;

import org.junit.Assert;
import org.junit.Test;

public class CountElementsTest {

  private CountElements target;

  @Test
  public void shouldCountAndFindElements() {
    // given
    int[] numbers = {1, 2, 3};
    target = new CountElements();

    // when
    int actual = target.count(numbers);

    // then
    Assert.assertEquals(2, actual);
  }

  @Test
  public void shouldCountAndFindElements_() {
    // given
    int[] numbers = {1, 1, 2, 2};
    target = new CountElements();

    // when
    int actual = target.count(numbers);

    // then
    Assert.assertEquals(2, actual);
  }

  @Test
  public void shouldCountAndFindElements__() {
    // given
    int[] numbers = {1, 3, 2, 3, 5, 0};
    target = new CountElements();

    // when
    int actual = target.count(numbers);

    // then
    Assert.assertEquals(3, actual);
  }

  @Test
  public void shouldCountAndFindElements___() {
    // given
    int[] numbers = {1, 1, 3, 3, 5, 5, 7, 7};
    target = new CountElements();

    // when
    int actual = target.count(numbers);

    // then
    Assert.assertEquals(0, actual);
  }

}
