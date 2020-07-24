package main.java.com.rflpazini.playground;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Lists {

  public int secondBiggestNumber(final List<Integer> array) {
    long start = System.currentTimeMillis();

    Collections.sort(array);
    int result = array.get(array.size() - 2);

    long end = System.currentTimeMillis();

    System.out.println("secondBiggestNumber_took: " + (end - start));

    return result;
  }

  public int secondBiggestFromScratch(final List<Integer> array) {
    long start = System.currentTimeMillis();

    int size = array.size();
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (array.get(i) > array.get(j)) {
          int temp = array.get(i);
          array.set(i, array.get(j));
          array.set(j, temp);
        }
      }
    }

    int result = array.get(size - 2);

    long end = System.currentTimeMillis();
    System.out.println("secondBiggestFromScratch_took: " + (end - start));

    return result;
  }

  public boolean checkList(final List<String> array) {
    boolean containsWordNormal = array.contains("TICO");

    return containsWordNormal;
  }

  public boolean checkListStream(final List<String> array) {
    return array.stream().anyMatch("TICO".toLowerCase()::contains);
  }
}
