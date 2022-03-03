package com.rflpazini.playground;

public class BinarySearch {

  public int searchFor(final int number, final int[] in) {
    int low = 0;
    int steps = 0;
    int high = in.length - 1;

    while (low <= high) {
      steps++;

      int middle = low + (high - low) / 2;
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

  public int indexOfSearch(final int nums[], final int target) {
    int left = 0;
    int pivot = 0;
    int right = nums.length - 1;

    while (left <= right) {
      pivot = left + (right - left) / 2;

      if (nums[pivot] == target) {
        return pivot;
      }

      if (target < nums[pivot]) {
        right = pivot - 1;
      } else {
        left = pivot + 1;
      }
    }

    return -1;
  }
}
