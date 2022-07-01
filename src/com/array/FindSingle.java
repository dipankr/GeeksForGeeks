package com.array;
/*
    Single Number
    Problem Description

    Given an array of integers A, every element appears twice except for one. Find that single one.

    NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
//XOR
public class FindSingle {
    public static int findSingle(int[] arr){
        /*
            //n^2
            for i=0 -> len
                for j=i+1 -> len
                    found dupliate? - continue
                return i

             //2n -> n time / n space
             for i=0 -> len
                map (digit, occurrence)
             for i=0 -> len
                if map.occurrence ==1 -> return map.digit

             // n time, o(1) space --- XOR
             // 0 ^ 1 = 1  1 ^ 1 = 0
             for i=0 -> len
                result ^ input[i]
             return result
         */
        int result=arr[0];
        for(int i=1; i<arr.length; i++)
            result ^= arr[i];
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1,3,2,4,1,3,4,2,5};
        System.out.println("result: "+findSingle(input));
    }
}
