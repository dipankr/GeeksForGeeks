package com.array;

import java.util.*;

//given A[] of N size, find j-i
//constraint A[i] <= A[j]
public class MaximumIndex {
    public static void main(String[] args) {
        int[] A = {34,8,10,3,2,80,30,33,1};

        System.out.println("Result: "+maxIndex(A));
    }
    public static int maxIndex(int[] A){
        if(A == null || A.length == 0) return -1;
        Map<Integer, Integer> maxIndexMap = new HashMap<>();
        int maxIndex = 0;
        int j = A.length-1;

        for(int i=0; i<A.length; i++){
            while(A[i]>A[j] && i<j) j--;
            maxIndexMap.put(A[i], j);
            j = A.length-1;
        }

        for(int i=0; i<A.length; i++){
            maxIndex = Math.max(maxIndexMap.get(A[i])-i, maxIndex);
        }

        return maxIndex;
    }
}
