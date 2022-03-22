package com.rflpazini.playground;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MinimumRemoveToMakeValidParenthesesTest {

  public MinimumRemoveToMakeValidParentheses target;

  @Before
  public void init() {
    target = new MinimumRemoveToMakeValidParentheses();
  }

  @Test
  public void shouldValidateRightParentheses_withLeetCodeWord() {
    // given
    var first = "lee(t(c)o)de)";

    // when
    var actual = target.minRemoveToMakeValid(first);

    // then
    assertEquals("lee(t(c)o)de", actual);
  }

  @Test
  public void shouldValidateEmptyWord() {
    // given
    var empty = "))((";

    // when
    var actual = target.minRemoveToMakeValid(empty);

    // then
    assertEquals("", actual);
  }

}