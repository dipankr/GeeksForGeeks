package com.array;
import java.util.*;
//find continuous subarray with the given sum
public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,6,5,7,9};
        int S = 26;

        System.out.println("Result: ");
        for(int i : subArrayWithSum(arr,S))
            System.out.print(i+" ");
    }

    private static int[] subArrayWithSum(int[] arr, int S) {
        if(arr == null || arr.length == 0) return null;

        int i = 0;
        int j = 0;
        int currentSum = 0;

        while(j<arr.length){
            currentSum += arr[j];
            while(currentSum > S){
                currentSum -= arr[i++];
            }
            if(currentSum == S) break;
            j++;
        }

        return new int[]{i, j};
    }
}
