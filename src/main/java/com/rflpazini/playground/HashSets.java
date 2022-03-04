package com.rflpazini.playground;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HashSets {
  public int removeDuplicates(int[] numbers) {
    if (numbers.length == 0) {
      return 0;
    }
    numbers = IntStream.of(numbers).distinct().toArray();
    System.out.println(Arrays.toString(numbers));

    return numbers.length;
  }

  public int removeDuplicatesBrute(int[] numbers) {
    int length = numbers.length;
    if (length == 0) {
      return 0;
    }

    int targetIndex = 1;
    int pivot = numbers[0];

    for (int i = 1; i < length; i++) {
      if (numbers[i] != pivot) {
        pivot = numbers[i];
        numbers[targetIndex] = numbers[i];
        targetIndex++;
      }
    }

    return targetIndex;
  }
}
