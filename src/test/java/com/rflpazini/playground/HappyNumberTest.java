package test.java.com.rflpazini.playground;

import main.java.com.rflpazini.playground.HappyNumber;
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

  @Test
  public void shouldFindHappyNumber_() {
    // given
    int number = 1;

    // when
    boolean actual = target.isHappy(number);

    //then
    Assert.assertTrue(actual);
  }

}
