package com.rflpazini.playground;

import java.util.List;

public class PDFViewer {

  public int designerPdfViewer(List<Integer> h, String word) {
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
