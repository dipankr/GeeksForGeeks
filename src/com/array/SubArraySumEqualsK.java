package com.array;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] ar = new int[]{1,2,3};
        int k = 3;

        System.out.println("Result: "+subArraySumCount(ar, k));
    }
    public static int subArraySumCount(int[] ar, int k){
        int sumCount = 0;
        int i = 0, j = 0;

        int currSum = 0;
        while (j<ar.length){
            currSum += ar[j++];

            while(currSum > k){
                currSum -= ar[i++];
            }

            if(currSum == k) sumCount++;
        }
        return sumCount;
    }
}
