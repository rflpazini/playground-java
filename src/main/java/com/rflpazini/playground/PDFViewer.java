package com.rflpazini.playground;

import java.util.List;

public class PDFViewer {

  public static void main(String[] args) {
    List<Integer> h = List.of(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7);
    String w = "zaba";

    var result = designerPdfViewer(h, w);

    System.out.println(result);
  }

  public static int designerPdfViewer(List<Integer> h, String word) {
    var maxHeight = 0;
    for (int i = 0; i < word.length(); i++) {
      var temp = h.get(word.charAt(i) - 97);
      if (temp > maxHeight) {
        maxHeight = temp;
      }
    }

    return word.length() * maxHeight;
  }
}
