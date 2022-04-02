package com.rflpazini.playground;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListsTest {

  private Lists target;

  @Before
  public void init() {
    this.target = new Lists();
  }

  @Test
  public void testGetSecondBiggestNumber() {
    // given
    List<Integer> insertions = Arrays.asList(1, 2, 3, 4, 5, 5, 9, 13);

    // when
    target = new Lists();
    int current = target.secondBiggestNumber(insertions);

    // then
    Assert.assertEquals(9, current);
  }

  @Test
  public void testGetSecondBiggestNumber_fromScratch() {
    // given
    List<Integer> insertions = Arrays.asList(13, 2, 34, 55, 67, 3, 5, 32, 83, 41);

    // when
    target = new Lists();
    int current = target.secondBiggestFromScratch(insertions);

    // then
    Assert.assertEquals(67, current);
  }

  @Test
  public void shouldFindWord_asNormalWay() {
    // given
    List<String> in = Arrays.asList("Rafa", "Ramires", "TICO");

    // when
    target = new Lists();
    boolean actual = target.checkList(in);

    // then
    Assert.assertTrue(actual);
  }

  @Test
  public void shouldFindWord_asStreamWay() {
    // given
    List<String> in = Arrays.asList("Rafa", "Ramires", "tico");

    // when
    target = new Lists();
    boolean actual = target.checkListStream(in);

    // then
    Assert.assertTrue(actual);
  }

  @Test
  public void shouldFindBuildsWithOceanView() {
    // given
    int[] buildingsHeight = new int[]{4, 2, 3, 1};

    // when
    var actual = target.findBuildings(buildingsHeight);

    // then
    var expected = new int[]{0, 2, 3};
    Assert.assertArrayEquals(expected, actual);
  }
}
