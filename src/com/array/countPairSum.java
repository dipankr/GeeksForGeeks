package com.array;

import java.util.*;

public class countPairSum {
    public static void main(String[] args) {
        //int[] arr = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
        int[] arr = {1,3,2,5,5,4,7,6,8};
        int S = 10;

        System.out.println("result: "+countPairs(arr,S));
    }

    private static int countPairs(int[] arr, int S) {
        /*
            //n time (2n) n space
            for i->len
                if hmap[i] -> hmap[i]++
                else hmap[i]=1
            for i->len
                if(hmap[S-i] && hmap[S-i]!=0 && hmap[i]!=0)
                    count++
                    hmap[i]-=1
                    hmap[S-i]-=1
             return count;

         */
        int doubleCount=0;
        Map<Integer,Integer> hmap = new HashMap<>();

        for(int i : arr){
            if(!hmap.containsKey(i))
                hmap.put(i, 0);
            hmap.put(i, hmap.get(i)+1);
        }
        for(int i : arr){
            /*if(hmap.get(S-i)!=null && hmap.get(S-i)>0 && hmap.get(i)>0){
                count++;
                hmap.put(i, hmap.get(i)-1);
                hmap.put(S-i, hmap.get(S-i)-1);
            }*/
            if(hmap.containsKey(S - i))
                doubleCount+=hmap.get(S-i);
            if(S-i==i) doubleCount--;
        }

        return doubleCount/2;
    }
}
