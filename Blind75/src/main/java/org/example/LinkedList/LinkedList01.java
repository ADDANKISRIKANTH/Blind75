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
        System.out.println();
    }

    public int size(){

        int count=0;
        Node current = first;

        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean search(int searchData){
        boolean flag = false;
        Node current = first;

        while(current != null){

            if(current.data == searchData){
                flag = true;
                break;
            }
            current = current.next;
        }
        return flag;
    }

    int index(int searchData){

        boolean flag = false;
        int index = -1;
        Node current = first;

        while(current != null){

            index++;
            if(current.data == searchData){
                flag = true;
                break;
            }
            current = current.next;
        }
        return flag ? index : -1;
    }

    public int nextTo(int data){
        int nextData = 0;
        Node current = first;

        while(current != null){
            if(current.data == data){
                nextData = (current.next != null) ? current.next.data : 0;
                break;
            }
            current = current.next;
        }
        return nextData;
    }

    public int prevData(int data){
        int prevData=0;
        Node current = first,prev = first;

        while(current != null){

            if(current.data == data){
                prevData = prev.data;
                break;
            }
            prev = current;
            current = current.next;
        }
        return prevData;
    }

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
