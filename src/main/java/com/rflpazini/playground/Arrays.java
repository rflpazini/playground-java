package com.rflpazini.playground;

import static java.util.Arrays.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;

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
      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }
      map.put(nums[i], i);
    }

    return null;
  }

  public List<List<Integer>> threeSum(int[] nums) {
    sort(nums);
    List<List<Integer>> resp = new ArrayList<>();

    for (int i = 0; i < nums.length && nums[i] <= 0; ++i) {
      if (i == 0 || nums[i - 1] != nums[i]) {
        twoSumII(nums, i, resp);
      }
    }

    return resp;
  }

  void twoSumII(int[] nums, int i, List<List<Integer>> resp) {
    var group = new HashSet<Integer>();

    for (int j = i + 1; j < nums.length; ++j) {
      int complement = -nums[i] - nums[j];
      if (group.contains(complement)) {
        resp.add(asList(nums[i], nums[j], complement));
        while (j + 1 < nums.length && nums[j] == nums[j + 1]) {
          ++j;
        }
      }
      group.add(nums[j]);
    }
  }

  public int[] rotate(int[] num, int k) {
    int numLength = num.length - 1;
    int pivot = numLength - k;

    rotationHelper(0, pivot, num);
    rotationHelper(pivot + 1, numLength, num);

    rotationHelper(0, numLength, num);

    return num;
  }

  private void rotationHelper(int start, int end, int[] nums) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }


  /*
   * Given n non-negative integers a1, a2, ..., an ,
   * where each represents a point at coordinate (i, ai).
   * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
   * Find two lines, which together with x-axis forms a container, such that the container contains
   * the most water.
   *
   * Note: You may not slant the container and n is at least 2.
   *
   * Example...
   * Input: [1,8,6,2,5,4,8,3,7]
   * Output: 49
   */
  public int maxArea(int[] height) {
    int area = 0;
    int l = 0, r = height.length - 1;

    while (l < r) {
      area = Math.max(area, Math.min(height[l], height[r]) * (r - l));
      if (height[l] < height[r]) {
        l++;
      } else {
        r--;
      }
    }

    return area;
  }

  public int[][] merge(int[][] intervals) {
    sort(intervals, Comparator.comparingInt(a -> a[0]));
    LinkedList<int[]> merged = new LinkedList();

    for (int[] interval : intervals) {
      if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
        merged.add(interval);
      } else {
        merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
      }
    }

    return merged.toArray(new int[merged.size()][]);
  }

  //You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians).
  // The soldiers are positioned in front of the civilians.
  // That is, all the 1's will appear to the left of all the 0's in each row.
  //
  //A row i is weaker than a row j if one of the following is true:
  //
  //The number of soldiers in row i is less than the number of soldiers in row j.
  //Both rows have the same number of soldiers and i < j.
  //Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
  public int[] kWeakestRows(int[][] mat, int k) {
    int rows = mat.length;
    int cols = mat[0].length;

    // save pairs
    int[][] pairs = new int[rows][2];

    for (int i = 0; i < rows; i++) {
      int strength = 0;
      for (int j = 0; j < cols; j++) {
        if (mat[i][j] == 0) {
          break;
        }
        strength++;
      }
      pairs[i][0] = strength;
      pairs[i][1] = i;
    }

    sort(pairs, (a, b) -> {
      if (a[0] == b[0]) {
        return a[1] - b[1];
      } else {
        return a[0] - b[0];
      }
    });

    int[] index = new int[k];
    for (int i = 0; i < k; i++) {
      index[i] = pairs[i][1];
    }

    return index;
  }

  /**
   * The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
   *
   * You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
   *
   * For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
   *
   * Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
   */
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> hash = new HashMap<>();
    for (int i = 0; i < nums2.length; i++) {
      hash.put(nums2[i], i);
    }

    int[] res = new int[nums1.length];
    int j;

    for(int i = 0; i < nums1.length; i++) {
      for(j = hash.get(nums1[i]) + 1; j < nums2.length; j++) {
        if(nums1[i] < nums2[j]) {
          res[i] = nums2[j];
          break;
        }
      }

      if(j == nums2.length) {
        res[i] = -1;
      }
    }

    return res;
  }

  /**
   * You are given an array of integers stones where stones[i] is the weight of the ith stone.
   *
   * We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
   *
   * If x == y, both stones are destroyed, and
   * If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
   * At the end of the game, there is at most one stone left.
   *
   * Return the smallest possible weight of the left stone. If there are no stones left, return 0.
   *
   * @param stones
   * @return
   */
  public int lastStoneWeight(int[] stones) {
    var heap = new PriorityQueue<Integer>(Comparator.reverseOrder());
    for(int stone: stones) {
      heap.add(stone);
    }

    while(heap.size() > 1) {
      int firstStone = heap.remove();
      int secondStone = heap.remove();

      if(firstStone != secondStone) {
        heap.add(firstStone - secondStone);
      }
    }

    return heap.isEmpty() ? 0 : heap.remove();
  }
}
