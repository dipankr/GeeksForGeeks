package com.string;
import java.util.*;
import java.util.stream.Collectors;

public class MaxLengthConcatString {
    static int res;
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.addAll(Arrays.asList("cha","r","act","ers"));

        System.out.println("Result: "+maxLength(arr));
    }

    public static int maxLength(List<String> arr){
        if(arr.isEmpty()) return -1;
        if(arr.size() == 1) return isUnique(arr.get(0)) ? arr.get(0).length() : 0;
        dfs(arr, 0, "");
        return res;
    }
    private static void dfs(List<String> l, int idx, String s) {
        if (isUnique(s)) res = Math.max(res, s.length());
        else return;
        for (int i = idx; i < l.size(); i++) {  // start with idx;
            if (isUnique(l.get(i))) dfs(l, i + 1, s + l.get(i));
        }
    }

    private static boolean isUnique(String s) {
        Set<Character> set = s.chars()
                .mapToObj(e->(char)e).collect(Collectors.toSet());
        return (set.size() == s.length());
    }

    /*public static int maxLength(List<String> arr) {
        if(arr.size()<=1) return arr.size();

        int maxLength = 0;
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<arr.size(); i++){
            String currString = arr.get(i);
            map.put(currString, new ArrayList<>());
            for(int j=i+1; j<arr.size(); j++){
                String nextString = arr.get(j);
                int k=0;
                while(k < nextString.length() && currString.indexOf(nextString.charAt(k)) == -1) k++;
                if(k < nextString.length()) continue;

                maxLength = Math.max(maxLength, currString.length() + nextString.length());
                map.get(currString).add(nextString);
            }
        }

        printMap(map);

        return maxLength;
    }

    private static void printMap(Map<String, List<String>> map){
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            String key = entry.getKey();
            List<String> values = entry.getValue();

            System.out.print(key+":");
            for(String val : values) System.out.print(" "+val);

            System.out.println();
        }
    }*/
}
/*
int res = 0;
    public int maxLength(List<String> arr) {
        dfs(arr, 0, "");
        return res;
    }

    private void dfs(List<String> l, int idx, String s) {
        if (unique(s)) res = Math.max(res, s.length());
        else return;
        for (int i = idx; i < l.size(); i++) {  // start with idx;
            if (unique(l.get(i))) dfs(l, i + 1, s + l.get(i));
        }
    }

    private boolean unique(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            if (++cnt[c - 'a'] > 1) return false;
        }
        return true;
    }
}
 */