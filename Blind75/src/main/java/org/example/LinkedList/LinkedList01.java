package org.example.LinkedList;

public class LinkedList01 {

    Node first;

    Node last;


    public void add(int data){
        Node node = new Node(data);
        if(first == null){
            first = node;
        }else{
            last.next = node;
        }
        last = node;
    }

    public void read(){
        Node current = first;

        while(current != null){
            System.out.print(current.data+",");
            current = current.next;
        }
    }

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
