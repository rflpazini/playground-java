package com.rflpazini.playground;

public class BinarySearch {

  public int searchFor(final int number, final int[] in) {
    int low = 0;
    int steps = 0;
    int high = in.length - 1;

    while (low <= high) {
      steps++;

      int middle = (low + high) / 2;
      int guess = in[middle];

      if (guess == number) {
        System.out.println("Steps taken: " + steps);
        return middle;
      }

      if (guess > number) {
        high = middle - 1;
      } else {
        low = middle + 1;
      }
    }

    System.out.println("Steps taken: " + steps);
    return 0;
  }
}
