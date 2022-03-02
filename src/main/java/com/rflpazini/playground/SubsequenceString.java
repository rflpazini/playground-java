package com.rflpazini.playground;

public class SubsequenceString {

  public static void main(String[] args) {
    isSubsequence("abc", "ahbgdc"); // true
    isSubsequence("axc", "ahbgdc"); // false
  }

  public static boolean isSubsequence(String s, String t) {
    if (s.length() > t.length()) {
      return false;
    }

    int i = 0;
    int j = 0;
    while (i < t.length() && j < s.length()) {
      if (t.charAt(i) == s.charAt(j)) {
        j++;
      }
      i++;
    }

    return j == s.length();
  }
}

