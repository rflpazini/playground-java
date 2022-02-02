package com.rflpazini.playground;

import java.util.HashSet;
import java.util.Set;

public class CountElements {

  public int count(int[] arr) {
    int count = 0;
    Set<Integer> elements = new HashSet<>();

    for (int element : arr) {
      elements.add(element);
    }

    for (int i = 0; i < arr.length; i++) {
      int sum = arr[i] + 1;
      if (elements.contains(sum)) {
        count++;
      }
    }

    return count;
  }
}
