package com.rflpazini.playground;

public class ContainerMaxSize {

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

  public int maxAreaBrutalForce(int[] heights) {
    int maxWaterVolume = 0;
    int heightsLength = heights.length;

    for (int i = 0; i < heightsLength; i++) {
      for (int j = 0; j < heightsLength; j++) {
        maxWaterVolume = Math.max(maxWaterVolume, Math.min(heights[i], heights[j]) * (j - i));
      }
    }

    return maxWaterVolume;
  }

  public int maxAreaTwoPointers(int[] heights) {
    int maxWaterVolume = 0;
    int left = 0;
    int right = heights.length - 1;

    do {
      maxWaterVolume =
          Math.max(maxWaterVolume, Math.min(heights[left], heights[right]) * (right - left));
      if (heights[left] < heights[right]) {
        left++;
      } else {
        right--;
      }
    } while (left < right);

    return maxWaterVolume;
  }
}
