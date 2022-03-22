package com.rflpazini.playground.linkedlist;

public class LinkedList<T> {

  public ListNode<T> head;

  public LinkedList() {
    this.head = null;
  }

  public void add(T value) {
    ListNode node = new ListNode(value, null);
    if (this.head != null) {
      node.next = head;
    }
    this.head = node;
  }

  public int size() {
    int count = 0;
    ListNode temp = this.head;

    while (temp != null) {
      count++;
      temp = temp.next;
    }

    return count;
  }

  public void print() {
    ListNode node = this.head;
    while (node != null) {
      System.out.print(node.val + "->");
      node = node.next;
    }
  }
}
