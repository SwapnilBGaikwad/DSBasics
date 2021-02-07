package com.example.linear;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<T> implements List<T> {
    private ListNode<T> head;
    private ListNode<T> tail;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        ListNode<T> curr = head;
        while (curr != null) {
            if (curr.getVal().equals(o)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[size];
        ListNode<T> curr = head;
        for (int i = 0; i < size; i++) {
            arr[i] = curr.getVal();
            curr = curr.next;
        }
        return arr;
    }

    @Override
    public <T1> T1[] toArray(T1[] arr) {
        if (arr.length < size()) {
            arr = ((T1[]) Array.newInstance(arr.getClass().getComponentType(), this.size));
        }
        Object[] tmp = arr;
        ListNode<T> curr = this.head;
        for (int i = 0; i < size; i++) {
            tmp[i] = curr.getVal();
            curr = curr.next;
        }
        return arr;
    }

    @Override
    public boolean add(T val) {
        ListNode<T> newNode = new ListNode<>(val);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return true;
        }
        tail.next = newNode;
        tail = tail.next;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        ListNode<T> curr = getListNode(index);
        return curr.getVal();
    }

    private ListNode<T> getListNode(int index) {
        ListNode<T> curr = this.head;
        for (int i = 0; i < index && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            throw new IndexOutOfBoundsException("Index if too large " + index);
        }
        return curr;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        if (index == 0) {
            T val = head.getVal();
            head = head.next;
            size--;
            return val;
        }
        ListNode<T> prevNode = getListNode(index - 1);
        T val = prevNode.next.getVal();
        prevNode.next = prevNode.next.next;
        return val;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
