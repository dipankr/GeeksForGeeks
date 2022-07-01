package com.linkedlist;

import java.util.Arrays;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Node n1                 = new Node(2);
        n1.next                 = new Node(3);
        n1.next.next            = new Node(1);
        n1.next.next.next       = new Node(3);
        n1.next.next.next.next  = new Node(2);

        System.out.print("Input: ");
        LinkedList.printLinkedLIst(n1);

        boolean isPalindrome = isPlaindrome(n1);
        System.out.println("isPalindrome = " + isPalindrome);
    }



    //palindrome LinkedList
    public static boolean isPlaindrome(Node head){
        Node mid = head;
        Node tmp = head;

        while(tmp!=null && tmp.next!=null){
            tmp = tmp.next.next;
            mid = mid.next;
        }

        mid = reverse(mid);
        tmp = head;

        while(mid!=null){
            if(mid.val != tmp.val)
                return false;
            mid=mid.next;
            tmp=tmp.next;
        }
        return true;
    }

    private static Node reverse(Node head) {
        Node temp = null;

        while(head != null){
            Node next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }

        return temp;
    }
}
