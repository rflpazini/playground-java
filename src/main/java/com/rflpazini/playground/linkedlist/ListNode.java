package com.rflpazini.playground.linkedlist;

public class ListNode<T> {

  public T val;
  public ListNode next;

  public ListNode() {
  }

  public ListNode(T val) {
    this.val = val;
  }

  public ListNode(T val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
