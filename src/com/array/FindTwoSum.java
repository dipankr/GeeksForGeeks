package com.array;
import java.util.*;

public class FindTwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,7,6,4};
        int S = 11;
        int[] result = findTwoSum(arr, S);
        System.out.println("Result: [" +result[0]+","+result[1]+"]" );
    }

    public static int[] findTwoSum(int[] arr, int S){
        int[] result = new int[]{-1,-1};
        Set<Integer> set = new HashSet<>();
        if(arr.length == 0) return result;

        for(int i : arr) {
            if(set.contains(S-i)) return new int[]{i,S-i};
            set.add(i);
        }

        return result;
    }
}
