package com.rflpazini.playground;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringsTest {

  public Strings target;

  @Before
  public void init() {
    target = new Strings();
  }

  @Test
  public void shouldValidateIfStringHasOnlyUniqueChars_withHashTable() {
    // given
    String first = "Rafael";
    String second = "Jorel";

    // then
    assertFalse(target.isUniqueChar_withHashTable(first));
    assertTrue(target.isUniqueChar_withHashTable(second));
  }

  @Test
  public void shouldValidateIfStringHasOnlyUniqueChars_withCharSet() {
    // given
    String first = "Fernanda";
    String second = "James";

    // then
    assertFalse(target.isUniqueChar(first));
    assertTrue(target.isUniqueChar(second));

  }

  @Test
  public void shouldValidateIfStringHasOnlyUniqueChars_withMoreThan128Char() {
    // given
    String first =
        "IMZxKvMEy36YHoktEhTreHddA2PXW4Fg90kv66Hw42z7hFedMoLeVKK0pu57NC69xPj6LE6oFPZ5ss02"
            + "a3em130cxQ3PLPhOI7cttWMiGEfnH5iVE3pz8c9aGov8qhHDa";

    // then
    assertFalse(target.isUniqueChar(first));
  }

  @Test
  public void shouldValidateIfContainsSubstring() {
    // given
    String principal = "ahbgdc";
    String sub = "abc";

    // when
    boolean actual = target.isSubsequence(sub, principal);

    // then
    assertTrue(actual);
  }

  @Test
  public void shouldValidateIfNotContainsSubstring() {
    // given
    String principal = "ahbgdc";
    String sub = "axc";

    // when
    boolean actual = target.isSubsequence(sub, principal);

    // then
    assertFalse(actual);
  }

  @Test
  public void shouldValidateIfSubstringIsGreaterThanTarget() {
    // given
    String principal = "ahbgdc";
    String sub = "axcasdasd";

    // when
    boolean actual = target.isSubsequence(sub, principal);

    // then
    assertFalse(actual);
  }

}
