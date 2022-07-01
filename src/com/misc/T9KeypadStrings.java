package com.misc;
import java.util.*;

/*
    2 -> abc
    3 -> def
    4 -> ghi
    5 -> jkl
    6 -> mno
    7 -> pqrs
    8 -> tuv
    9 -> wxyz
 */
public class T9KeypadStrings {
    private static String input;
    private static Map<Integer, String> keymap;

    //getChars(2) -> "abc"
    private static String getChars(int digit){
        keymap = new HashMap<>();
        keymap.put(2,"abc");
        keymap.put(3, "def");
        keymap.put(4, "ghi");
        keymap.put(5, "jkl");
        keymap.put(6, "mno");
        keymap.put(7, "pqrs");
        keymap.put(8, "tuv");
        keymap.put(9, "wxyz");

        return keymap.get(digit);
    }

    //trigger
    public static void main(String[] args) {
        String numbers = "237";

        System.out.println("Result:");

        for(String s : getStrings(numbers))
            System.out.print(s+" ");
    }

    //actual method
    private static List<String> getStrings(String numbers){
        input = numbers;
        return getAllStrings(0);
    }

    //helper method, recursive calls
    private static List<String> getAllStrings(int index){
        if(index >= input.length()) return new ArrayList<>();

        int digit = input.charAt(index)-'0';
        if(digit <= 1) throw new IllegalArgumentException("Invalid input digit: "+digit);

        String chars = getChars(digit);
        List<String> currStrings = getAllStrings(index+1);
        List<String> result = new ArrayList<>();

        if(currStrings.isEmpty()) currStrings.add("");
        for(char c : chars.toCharArray()) {
            for (String s : currStrings)
                result.add(c + s);
        }

        return result;
    }

}
