package com.rflpazini.playground;

public class Matrix {

  // O(nˆ2)
  // search for element using brute force
  public static boolean searchMatrixBruteForce(int[][] matrix, int target) {
    int col = matrix[0].length;

    for (int[] row : matrix) {
      for (int j = 0; j < col; j++) {
        if (row[j] == target) {
          return true;
        }
      }
    }

    return false;
  }

}
