package com.rflpazini.playground;

import java.util.Hashtable;

public class Strings {

  // O(n) Space and time
  public boolean isUniqueChar_withHashTable(String str) {
    Hashtable<Character, Integer> compare = new Hashtable<>();

    for (char c : str.toCharArray()) {
      int count = 0;
      if (compare.containsKey(c)) {
        return false;
      }
      compare.put(c, ++count);
    }

    return true;
  }

  // O(n) time
  // O(1) space
  public boolean isUniqueChar(String str) {
    if (str.length() > 128) {
      return false;
    }

    boolean[] charSet = new boolean[128];
    for (int i = 0; i < str.length(); i++) {
      int val = str.charAt(i);
      if (charSet[val]) {
        return false;
      }
      charSet[val] = true;
    }

    return true;
  }

}
