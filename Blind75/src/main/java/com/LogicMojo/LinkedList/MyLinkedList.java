package com.LogicMojo.LinkedList;

public class MyLinkedList {

    static Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }


    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node it = head;

        while(it.next != null){
            it = it.next;
        }
        it.next = newNode;
    }

    public void removeFirst(){

        Node it = head;
        it = it.next;
        head = it;
    }

    public void removeLast(){
        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void printList() {
        Node nodeValue = head;

        while (nodeValue != null) {
            System.out.println(nodeValue.data);
            nodeValue = nodeValue.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList newList = new MyLinkedList();
        head = null;
        newList.addLast("My");
        newList.addLast("Dsa");
        newList.addLast("Work");
        newList.addFirst("Hello");
        newList.removeLast();

        newList.printList();

    }
}
