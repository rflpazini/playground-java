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

    if (k == ls.size()) {
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

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;

    int carry = 0;

    while (l1 != null || l2 != null || carry == 1) {
      int sum = 0;
      if (l1 != null) {
        sum += (int) l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        sum += (int) l2.val;
        l2 = l2.next;
      }

      sum += carry;
      carry = sum / 10;
      ListNode node = new ListNode(sum % 10);
      curr.next = node;
      curr = curr.next;
    }

    return dummy.next;
  }
}
