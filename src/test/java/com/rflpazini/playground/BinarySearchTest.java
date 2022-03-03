package com.rflpazini.playground;

import com.rflpazini.playground.utils.Fixtures;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

  private BinarySearch target;

  @Before
  public void init() {
    this.target = new BinarySearch();
  }

  @Test
  public void shouldFindTheCorrectNumber() {
    // given
    int[] elemensts = Fixtures.SORTED_ARRAY_WITH_280_ELEMENTS;

    // then
    int actual = target.searchFor(9094, elemensts);

    // when
    Assert.assertEquals(250, actual);
  }

  @Test
  public void shouldFindTheCorrectNumber_withDoubleSizedArray() {
    // given
    int[] elements = Fixtures.SORTED_ARRAY_WITH_560_ELEMENTS;

    // then
    int actual = target.searchFor(2822, elements);

    // when
    Assert.assertEquals(182, actual);
  }

  @Test
  public void shouldNotFindTheNumberAndReturnZero() {
    // given
    int[] elements = Fixtures.SORTED_ARRAY_WITH_280_ELEMENTS;


    // then
    int actual = target.searchFor(1, elements);

    // when
    Assert.assertEquals(0, actual);
  }

  @Test
  public void shouldReturnIndexOfSearch() {
    // given
    int[] elements = Fixtures.SORTED_ARRAY_WITH_280_ELEMENTS;
    int targetNumber = 296;

    // then
    int actual = target.indexOfSearch(elements, targetNumber);

    // when
    Assert.assertEquals(9, actual);
  }
}
