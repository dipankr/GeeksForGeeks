package com.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ReverseLinkedListII {
    public static void main(String[] args) {
        Node n1                 = new Node(1);
        n1.next                 = new Node(2);
        n1.next.next            = new Node(3);
        n1.next.next.next       = new Node(4);
        n1.next.next.next.next  = new Node(5);

        System.out.print("Input:");
        LinkedList.printLinkedLIst(n1);

        System.out.println("Result: ");
        LinkedList.printLinkedLIst(reverseBetween(n1, 2, 4));
    }
    public static Node reverseBetween(Node root, int left, int right){
        return reverse(null, root, left, right, 1);
    }

    private static Node reverse(Node prev, Node current, int left, int right, int position) {
        Deque<Node> stack = new ArrayDeque<>();
        if(current==null) return null;

        while(position < left){
            stack.add(current);
            current = current.next;
        }
        return null;
    }
}