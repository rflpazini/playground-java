package main.java.com.rflpazini.playground;

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

}
