package com.rflpazini.playground;

import java.time.Duration;
import java.time.Instant;

public class SortArrays {

  // O(N)
  // Using pointers
  public int[] sortedSquaresBest(int[] nums) {
    Instant start = Instant.now();

    int low = 0, high = nums.length - 1;
    int index = high;
    int[] squares = new int[nums.length];

    while (low <= high) {
      if (Math.abs(nums[low]) >= Math.abs(nums[high])) {
        squares[index] = nums[low] * nums[low];
        index--;
        low++;
      } else {
        squares[index] = nums[high] * nums[high];
        index--;
        high--;
      }
    }

    Instant end = Instant.now();
    Duration timeElapsed = Duration.between(start, end);
    System.out.println(timeElapsed);
    return squares;
  }

  // O(n2)
  // Looping each element
  public int[] sortedSquares(int[] nums) {
    Instant start = Instant.now();
    for (int i = 0; i < nums.length; i++) {
      nums[i] = nums[i] * nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int temp = 0;
        if (nums[i] > nums[j]) {
          temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
      }
    }

    Instant end = Instant.now();
    Duration timeElapsed = Duration.between(start, end);
    System.out.println(timeElapsed);
    return nums;
  }
}
