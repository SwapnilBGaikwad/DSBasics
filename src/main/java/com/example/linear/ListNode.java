package com.example.linear;

public class ListNode<T> {
    private final T val;
    ListNode<T> next;

    public ListNode(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}
