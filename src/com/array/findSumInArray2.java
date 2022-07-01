package com.array;

import java.util.*;

public class findSumInArray2 {

    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4,7,6,8,9};
        int sum = 10;

        System.out.println("result: "+isSumPresent(arr,sum));
    }

    private static boolean isSumPresent(int[] arr, int sum) {
        /*
            //n^2
            for i=0->len
                for j=i+1->len
                    if arr[i]+arr[j]==sum return true
             return false

             //n time, n space
             list difference
             for i->len
                difference.add(sum-arr[i])
             for i->len
                if(difference.contains(arr[i])) return true;
             return false;
         */

        List<Integer> difference = new ArrayList<>();
        for(int i : arr) {
            if (difference.contains(i)) return true;
            difference.add(sum - i);
        }

        return false;
    }
}
