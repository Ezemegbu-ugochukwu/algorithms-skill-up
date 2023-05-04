package com.ugo;

public class LinkedList {
    public static void main(String[] args) {
       LinkedList ll = new LinkedList();
       ll.insertFirst(3);
       ll.insertFirst(4);
       ll.insertFirst(1);
       ll.insertFirst(8);
       ll.insertLast(99);

       ll.display();
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

    public void insertLast(int value){
        if (tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertFirst(int value) {
       Node node = new Node(value);
       node.next = head;
       head = node;

       if (tail == null){
           tail = head;
       }

       size += 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value +"->");
            temp = temp.next;
        }
        System.out.println("End");
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
