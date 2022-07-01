package com.array;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,3,8,9,15};
        int[] nums2 = {7,11,18,19,21,25};

        System.out.println("Result: "+findMedian(nums1, nums2));
    }

    public static void print(int[] arr){
        System.out.print("[");
        for(int i : arr) System.out.print(i+" ");
        System.out.print("]");
    }

    public static double findMedian(int[] nums1, int[] nums2){
        if(nums1.length > nums2.length)
            return findMedian(nums2, nums1);

        int x = nums1.length;
        int y = nums2.length;
        int start = 0;
        int end = x;

        while(start <= end){
            int partX = (start + end)/2;
            int partY = (x + y + 1)/2 - partX;

            int maxLeftX  = (partX == 0) ? Integer.MIN_VALUE : nums1[partX-1];
            int minRightX = (partX == x) ? Integer.MAX_VALUE : nums1[partX];

            int maxLeftY  = (partY == 0) ? Integer.MIN_VALUE : nums2[partY-1];
            int minRightY = (partY == y) ? Integer.MAX_VALUE : nums2[partY];

            if(maxLeftX <= minRightY && maxLeftY <= minRightX){
                if((x + y) % 2 == 0){
                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
                }else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) end = partX - 1;
            else start = partX + 1;
        }

        throw new IllegalArgumentException();
    }
}
