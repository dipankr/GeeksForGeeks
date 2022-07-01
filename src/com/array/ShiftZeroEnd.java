package com.array;
/*

 */
public class ShiftZeroEnd {

    public static void main(String[] args) {
        int[] input = {6,1,2,0,3,0,0,4,0,0,0,5};

        System.out.print("result: ");
        for(int i: shiftZeroEnd(input)) System.out.print(i+" ");
    }

    private static int[] shiftZeroEnd(int[] arr) {
        /*
            //n^2
            for i=0->len
                if a[i] != 0 -> continue
                for j=i+1->len
                    if a[j]!=0 break
                    if j==len-1 return
                swap a[i] - a[j]
                // op - 1,2,3,4,5,0,0,0,0,0...
             //n time, n space
             result[input.length]
             j=0;
             for i=0 -> len
                if arr[i]!=0
                    result[j++]=arr[i]
             // n time, o(1)
             j=0
             for i=0 -> len
                if arr[i]!=0 arr[j++]=arr[i]
             while j>=0 arr[len-j]=0
         */

        int counter = 0;
        int len = arr.length;

        for(int i=0; i<len; i++)
            if(arr[i]!=0) arr[counter++]=arr[i];

        while(counter < len) arr[counter++]=0;

        return arr;
    }
}
