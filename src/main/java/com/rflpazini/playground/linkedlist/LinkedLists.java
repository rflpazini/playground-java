package com.rflpazini.playground.linkedlist;

public class LinkedLists {

  public ListNode middleNode(ListNode head) {
    ListNode slow = head, fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }

  public LinkedList deleteNode(LinkedList ls, int k) {
    ListNode slow = ls.head, fast = ls.head;

    if(k == ls.size()) {
      ls.head = ls.head.next;
      return ls;
    }

    while (k > 0) {
      fast = fast.next;
      k--;
    }

    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }

    slow.next = slow.next.next;

    return ls;
  }

}
