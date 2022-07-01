package com.linkedlist;

public class ReverseLinkedList {
    public static Node reverse(Node n1) {
        Node temp = null, curr=n1, next;
        while(curr != null){
            next = curr.next;
            curr.next = temp;
            temp = curr;
            curr = next;
        }
        return temp;
    }

    public static void main(String[] args) {
        LinkedList.main(new String[]{});
        Node reversed = reverse(LinkedList.root);

        System.out.println("\nReversed: ");
        while(reversed != null){
            System.out.print("->"+reversed.val);
            reversed = reversed.next;
        }
    }
}
