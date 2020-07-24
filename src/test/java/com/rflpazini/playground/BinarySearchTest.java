package test.java.com.rflpazini.playground;

import main.java.com.rflpazini.playground.BinarySearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.com.rflpazini.playground.utils.Fixtures;

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
    int[] elemensts = Fixtures.SORTED_ARRAY_WITH_560_ELEMENTS;

    // then
    int actual = target.searchFor(2822, elemensts);

    // when
    Assert.assertEquals(182, actual);
  }

  @Test
  public void shouldNotFindTheNumberAndReturnZero() {
    // given
    int[] elemensts = Fixtures.SORTED_ARRAY_WITH_280_ELEMENTS;

    // then
    int actual = target.searchFor(1, elemensts);

    // when
    Assert.assertEquals(0, actual);
  }
}
