package com.rflpazini.playground;

import java.util.Arrays;
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

  public boolean isSubsequence(String s, String t) {
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

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }

    String ans = strs[0];
    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(ans) != 0) {
        ans = ans.substring(0, ans.length() - 1);
        if (ans.isEmpty()) {
          return "";
        }
      }
    }

    return ans;
  }

  public String reverse(String str) {
    int left = 0, right = str.length() - 1;

    char[] word = str.toCharArray();
    while (left < right) {
      swap(word, left++, right--);
    }

    return new String(word);
  }

  private char[] swap(char[] word, int l, int r) {
    char temp = word[l];
    word[l] = word[r];
    word[r] = temp;

    return word;
  }

}
