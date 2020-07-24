package test.java.com.rflpazini.playground;

import main.java.com.rflpazini.playground.LinkedLists;
import main.java.com.rflpazini.playground.ListNode;
import org.junit.Test;

public class LinkedListTest {
  private LinkedLists target = new LinkedLists();

  @Test
  public void shouldFindMiddle() {
    //given
    ListNode[] A = new ListNode[100];
    ListNode headMock = new ListNode(1);

    //when
    target.middleNode(headMock);

    //then

  }

}
