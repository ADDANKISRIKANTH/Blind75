package org.example.LinkedList;

public class LinkedListDriverClass {

    public static void main(String[] args) {
        LinkedList01 linkedList = new LinkedList01();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(60);
//        linkedList.removeLastNode();
        linkedList.read();
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.search(70));
//        System.out.println(linkedList.index(50));
        System.out.println(linkedList.readMiddleNode());
//



    }
}
