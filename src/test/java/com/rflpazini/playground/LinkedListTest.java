package com.rflpazini.playground;

import static org.junit.Assert.assertEquals;

import com.rflpazini.playground.linkedlist.LinkedList;
import com.rflpazini.playground.linkedlist.LinkedLists;
import com.rflpazini.playground.linkedlist.ListNode;
import com.rflpazini.playground.utils.Fixtures;
import org.junit.Test;

public class LinkedListTest {

  private LinkedLists target = new LinkedLists();

  @Test
  public void shouldFindMiddle() {
    //given
    LinkedList<Integer> ls = new LinkedList();
    populateListHelper(ls);

    //when
    ListNode actual = target.middleNode(ls.head);

    //then
    assertEquals(345, actual.val);
  }

  @Test
  public void shouldDeleteNthNode() {
    // given
    LinkedList<Integer> ls = new LinkedList();
    populateListHelper(ls);

    // when
    LinkedList actual = target.deleteNode(ls, 2);

    // then
    assertEquals(6, actual.size());
  }

  @Test
  public void shouldDeleteHead() {
    // given
    LinkedList<Integer> ls = new LinkedList();
    populateListHelper(ls);

    // when
    LinkedList actual = target.deleteNode(ls, 7);

    // then
    assertEquals(433, actual.head.val);
  }

  private LinkedList populateListHelper(LinkedList list) {
    for (int n : Fixtures.SIMPLE_ARRAY) {
      list.add(n);
    }

    return list;
  }

}
