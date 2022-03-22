package com.rflpazini.playground;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PDFViewerTest {

  public PDFViewer target;

  @Before
  public void init() {
    target = new PDFViewer();
  }

  @Test
  public void shouldCalculateHeightOfObject() {
    // given
    List<Integer> h = List.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
        5, 5, 7);
    String w = "zaba";

    // when
    var actual = target.designerPdfViewer(h, w);

    // then
    assertEquals(28, actual);
  }

}
