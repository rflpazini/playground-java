package com.rflpazini.playground;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Arrays {

  // O(N)
  // Add a new first element to an array
  // To do that you should reposition all elements of the array
  public int[] insertPolePosition(final int first, final int[] racingGrid) {
    int[] newRacingGrid = new int[racingGrid.length + 1];
    newRacingGrid[0] = first;

    for (int i = 0; i < racingGrid.length; i++) {
      newRacingGrid[i + 1] = racingGrid[i];
    }



    return newRacingGrid;
  }

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if(map.containsKey(complement)) {
        return new int[] { map.get(complement), i};
      }
      map.put(nums[i], i);
    }

    return null;
  }

}
