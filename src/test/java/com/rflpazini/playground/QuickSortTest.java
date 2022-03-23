package com.rflpazini.playground;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest {

  @Test
  public void shouldSortAnArray() {
    // given
    var arr = new int[]{293, 3999, 1238, 73, 48, 1029, 125, 3213, -932};

    // when
    QuickSort.doSortOf(arr);

    // then
    assertArrayEquals(new int[]{-932, 48, 73, 125, 293, 1029, 1238, 3213, 3999}, arr);
  }
}
