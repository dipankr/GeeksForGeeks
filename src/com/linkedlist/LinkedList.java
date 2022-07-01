package com.linkedlist;

public class LinkedList {
    public static Node root = null;
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node origianl = n1;
        System.out.println("Original: ");
        while(origianl != null){
            System.out.print("->"+origianl.val);
            origianl = origianl.next;
        }
        root = n1;
    }

    public static void printLinkedLIst(Node node) {
        while(node!=null){
            System.out.print("->"+node.val);
            node = node.next;
        }
        System.out.println();
    }

}
