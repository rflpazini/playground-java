package com.rflpazini.playground;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoveZerosTest {

  public MoveZeros target;

  @Before
  public void init() {
    target = new MoveZeros();
  }

  @Test
  public void shouldMoveZeroToEndOfLine() {
    // given
    int[] nums = {0, 1, 0, 3, 12};

    // when
    var actual = target.execute(nums);

    // then
    assertArrayEquals(new int[]{1, 3, 12, 0, 0}, actual);
  }

}