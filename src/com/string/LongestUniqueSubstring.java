package com.string;

import java.util.*;

public class LongestUniqueSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Result: "+lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0, i = 0, j = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLen = Math.max(maxLen, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return maxLen;
    }
}
