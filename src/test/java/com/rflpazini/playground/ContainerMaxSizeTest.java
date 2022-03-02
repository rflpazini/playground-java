package com.rflpazini.playground;

import org.junit.Assert;
import org.junit.Test;

public class ContainerMaxSizeTest {

  @Test
  public void shouldReturnMaxSizeOfWaterInAContainer() {
    // given
    int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    ContainerMaxSize target = new ContainerMaxSize();

    // when
    int actual = target.maxAreaBrutalForce(heights);

    // then
    Assert.assertEquals(49, actual);
  }

  @Test
  public void shouldReturnMaxSizeOfWaterInAContainer_withTwoPointers() {
    // given
    int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    ContainerMaxSize target = new ContainerMaxSize();

    // when
    int actual = target.maxAreaTwoPointers(heights);

    // then
    Assert.assertEquals(49, actual);
  }
}
