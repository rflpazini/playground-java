package com.rflpazini.playground;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MatrixTest {

  private Matrix target;

  @Before
  public void init() {
    target = new Matrix();
  }

  @Test
  public void shouldFindElevenAsTarget() {
    // given
    int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

    // when
    var actual = target.searchMatrixBruteForce(matrix, 11);

    // then
    assertTrue(actual);
  }

  @Test
  public void shouldNotFindTarget() {
    // given
    int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

    // when
    var actual = target.searchMatrixBruteForce(matrix, 2);

    // then
    assertFalse(actual);
  }

}
