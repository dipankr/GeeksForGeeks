package com.temp;

import java.util.*;

public class TestPriorityQueue {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,6,1,7,9,0};
        Math.sqrt(2);

        System.out.println("Result: ");
        System.out.println("Min: "+findMin(arr));
        System.out.println("Max: "+findMax(arr));
    }
    public static int findMin(int[] arr){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : arr)
            minHeap.add(i);

        return minHeap.peek();
    }

    public static int findMax(int[] arr){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((c1,c2) -> (c2.compareTo(c1)));
        for(int i : arr)
            maxHeap.add(i);

        return maxHeap.peek();
    }
}
