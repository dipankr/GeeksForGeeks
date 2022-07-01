package com.stack;

import java.util.*;

public class ParenthesisChecker {
    //Function to check if brackets are balanced or not.
    static boolean isBalanced(String input){

        Deque<Character> stack = new ArrayDeque<>();
        List<Character> openingBrackets = Arrays.asList(new Character[] {'(','[','{'});

        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);

            if(openingBrackets.contains(c)){
                stack.push(c);
                continue;
            }

            if(stack.isEmpty()) return false;
            char check = stack.pop();
            switch (c){
                case ')':
                    if(check=='{' || check=='[')
                        return false;
                    break;
                case '}':
                    if(check=='(' || check=='[')
                        return false;
                    break;
                case ']':
                    if(check=='{' || check=='(')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String input = "[()]{}{[()()]()}";

        System.out.println(input+" is balanced? "+isBalanced(input));
    }
}
