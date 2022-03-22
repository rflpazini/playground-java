package com.rflpazini.playground;

public class MoveZeros {

  // O(N) time and space
  public int[] execute(int[] nums) {
    int count = 0;
    int n = nums.length;
    int[] moved = new int[n];

    for (int i = 0; i < n; i++) {
      if (nums[i] != 0) {
        moved[count++] = nums[i];
      }
    }

    while (count < n) {
      moved[count++] = 0;
    }

    return moved;
  }
}
