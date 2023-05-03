package com.ugo;

public class LinkedList {
    public static void main(String[] args) {

    }
//    public listNode reverseList (listNode head) {
//       listNode prev = null;
//        while (head != null){
//            listNode next = head.next;
//            head.next = prev;
//            head = next;
//        }
//    }
//    return prev;

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {

    }

    private class Node {
        private int value;
        private Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
}
