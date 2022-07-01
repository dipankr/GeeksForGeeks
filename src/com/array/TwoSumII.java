package com.array;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {2,8,11,15,17};
        int target = 22;
        int[] result;

        result = twoSum(numbers, target);

        System.out.println("Result: ["+result[0]+","+result[1]+"]");
    }
    public static int[] twoSum(int[] numbers, int target){

        int start = 0;
        int end = numbers.length-1;

        while(start < end){
            int sum = numbers[start] + numbers[end];

            if(sum > target) end   -= 1;
            if(sum < target) start += 1;
            if(sum == target) return new int[]{start+1, end+1};
        }
        return null;
    }
}
