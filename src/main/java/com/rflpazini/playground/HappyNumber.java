package main.java.com.rflpazini.playground;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

  public boolean isHappy(int n) {
    Set<Integer> unique = new HashSet<>();

    while (unique.add(n)) {
      int value = 0;
      while (n > 0) {
        value += Math.pow(n % 10, 2);
        n /= 10;
      }
      n = value;
    }

    return n == 1;
  }
}
