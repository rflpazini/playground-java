package test.java.com.rflpazini.playground;

import main.java.com.rflpazini.playground.HashSets;
import org.junit.Assert;
import org.junit.Test;

public class HashSetsTestRemoveDuplecated {

  @Test
  public void testBla() {
    // given
    int[] numbers = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int expected = 5;

    // when
    HashSets target = new HashSets();
    int actual = target.removeDuplicates(numbers);

    // then
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testBla_() {
    // given
    int[] numbers = {1, 1, 2};
    int expected = 2;

    // when
    HashSets target = new HashSets();
    int actual = target.removeDuplicatesBrute(numbers);

    // then
    Assert.assertEquals(expected, actual);
  }
}
