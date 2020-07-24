package main.java.com.rflpazini.playground;

public class LinkedLists {

  public ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    System.out.println(slow.val);

    return slow;
  }

}
