package com.rflpazini.playground;

public class QuickSort {

  private static int[] sortedArray;

  private QuickSort(final int[] array) {
    sortedArray = array;
    initSort(sortedArray);
  }

  public static int[] getSortedArray() {
    return sortedArray;
  }

  public static QuickSort doSortOf(final int[] array) {
    return new QuickSort(array);
  }

  private void initSort(int[] arrayToSort) {
    doQuickSort(0, arrayToSort.length - 1);

  }

  private void doQuickSort(int left, int right) {
    if (right - left <= 0) {
      return;
    }

    int pivot = sortedArray[right];
    int location = partitionArray(left, right, pivot);

    doQuickSort(left, location - 1);
    doQuickSort(location + 1, right);
  }

  private int partitionArray(final int left, final int right, final int pivot) {
    int leftPointer = left - 1;
    int rightPointer = right;

    while (true) {
      while (sortedArray[++leftPointer] < pivot) {
        ;
      }
      while (rightPointer > 0 && sortedArray[--rightPointer] > pivot) {
        ;
      }
      if (leftPointer >= rightPointer) {

        break;

      } else {
        swapValues(leftPointer, rightPointer);
      }
    }

    swapValues(leftPointer, right);

    return leftPointer;
  }

  private void swapValues(int firstIndex, int secondIndex) {
    int savedValue = sortedArray[firstIndex];
    sortedArray[firstIndex] = sortedArray[secondIndex];
    sortedArray[secondIndex] = savedValue;
  }
}
