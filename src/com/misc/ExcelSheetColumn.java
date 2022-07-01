package com.misc;
import java.util.*;
public class ExcelSheetColumn {
    public static void main(String[] args) {
        int columnNumber = 2147483647;

        System.out.println("\nTitle for column number "+columnNumber+" is: "+convertToTitle(columnNumber));
    }

    /*
        A -> 1
        B -> 2
        C -> 3
        ...
        Z -> 26
        AA -> 27
        AB -> 28
        ...

        Input: columnNumber = 701
        Output: "ZY"
        Input: columnNumber = 2147483647
        Output: "FXSHRXW"
     */
    public static String convertToTitle(int columnNumber) {
        Map<Integer, Character> map = new HashMap<>();
        StringBuffer answer = new StringBuffer("");

        for(char c='A'; c<='Y'; c++)
            map.put((c-64),c);
        map.put(0,'Z');

        while(columnNumber != 0){
            int i = columnNumber%26;
            answer.insert(0,map.get(i));

            if(i==0)//char = Z
                columnNumber -= 1;

            columnNumber /= 26;
        }
        return answer.toString();
    }
}
