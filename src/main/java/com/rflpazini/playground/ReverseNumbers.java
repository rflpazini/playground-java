package com.rflpazini.playground;

public class ReverseNumbers {

  public int execute(int number) {
    int reverse = 0;

    while (number != 0) {
      int digit = number % 10;
      number /= 10;

      if (!isAThirdTwoBitsValidNumber(reverse, digit)) {
        return 0;
      }

      reverse = reverse * 10 + digit;
    }

    return reverse;
  }

  private boolean isAThirdTwoBitsValidNumber(int number, int digit) {
    if (number > Integer.MAX_VALUE / 10 || (number == Integer.MAX_VALUE / 10 && digit > 7)) {
      return false;
    }

    if (number < Integer.MIN_VALUE / 10 || (number == Integer.MIN_VALUE / 10 && digit < -8)) {
      return false;
    }

    return true;
  }
}
