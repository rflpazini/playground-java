package com.rflpazini.playground;

public class MinimumRemoveToMakeValidParentheses {

  public String minRemoveToMakeValid(String s) {
    int count = 0;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      // Check if is a letter
      if (c != '(' && c != ')') {
        sb.append(c);
      } else {
        // Increase parentheses' count
        if (c == '(') {
          count++;
          sb.append(c);
        } else if (count > 0) {
          sb.append(c);
          count--;
        }
      }
    }

    // Remove reminding parentheses
    while (count > 0) {
      sb.deleteCharAt(sb.lastIndexOf("("));
      count--;
    }

    return sb.toString();
  }
}
