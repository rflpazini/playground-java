package com.rflpazini.playground;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
    for (int i = 0; i < nums.length; ++i) {
      int complement = target - nums[i];
      if(map.containsKey(complement)) {
        return new int[] { map.get(complement), i};
      }
      map.put(nums[i], i);
    }

    return null;
  }

  public List<List<Integer>> threeSum(int[] nums) {
    java.util.Arrays.sort(nums);
    List<List<Integer>> resp = new ArrayList<>();

    for (int i = 0; i< nums.length && nums[i] <= 0; ++i) {
      if(i == 0 || nums[i - 1] != nums[i]) {
        twoSumII(nums, i, resp);
      }
    }

    return resp;
  }

  void twoSumII(int[] nums, int i, List<List<Integer>> resp){
    var group = new HashSet<Integer>();

    for (int j = i+1; j < nums.length; ++j) {
      int complement = -nums[i] - nums[j];
      if(group.contains(complement)) {
        resp.add(java.util.Arrays.asList(nums[i], nums[j], complement));
        while (j + 1 < nums.length && nums[j] == nums[j +1]) {
          ++j;
        }
      }
      group.add(nums[j]);
    }
  }

}
