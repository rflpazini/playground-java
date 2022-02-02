package com.rflpazini.playground;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HappyNumberTest {

  private HappyNumber target;

  @Before
  public void setup() {
    this.target = new HappyNumber();
  }

  @Test
  public void shouldFindHappyNumber() {
    // given
    int number = 19;

    // when
    boolean actual = target.isHappy(number);

    //then
    Assert.assertTrue(actual);
  }
}
