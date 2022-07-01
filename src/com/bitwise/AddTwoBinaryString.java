package com.bitwise;

public class AddTwoBinaryString {
    public static void main(String[] args) {
        String a = "1111", b = "0110";

        System.out.println("The sum is: "+addBinaryString(a,b));
    }

    public static String addBinaryString(String a, String b){
        if(a == null || b == null) return null;

        String result = "";
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while(i >= 0 || j >= 0){
            int temp, ai = 0, bj = 0;

            if(i >= 0) ai = Integer.valueOf(a.charAt(i--)-'0');
            if(j >= 0) bj = Integer.valueOf(b.charAt(j--)-'0');

            temp  = (ai + bj + carry) % 2;
            carry = (ai + bj + carry) / 2;

            result = temp + result;
        }

        if(carry != 0) result = carry + result;

        return result;
    }
}
