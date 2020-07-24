package test.java.com.rflpazini.playground;

import main.java.com.rflpazini.playground.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.com.rflpazini.playground.utils.Fixtures;

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
}
