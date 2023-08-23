package com.tengteng.algorithmlib;

/**
 * @author yejiasun
 * @date Create on 2/3/23
 */

class ListNode<T> {
    T value;
    ListNode next;

    public ListNode(T value) {
        setValue(value);
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
