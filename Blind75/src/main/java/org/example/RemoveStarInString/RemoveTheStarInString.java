package org.example.RemoveStarInString;

import java.util.Stack;

public class RemoveTheStarInString {
//    You are given a string s, which contains stars *.
//    In one operation, you can:
//    Choose a star in s.
//    Remove the closest non-star character to its left, as well as remove the star itself.
//    Return the string after all stars have been removed.

//    Input: s = "leet**cod*e"
//    Output: "lecoe"
//    Explanation: Performing the removals from left to right:
//            - The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
//            - The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
//            - The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
//    There are no more stars, so we return "lecoe".

    public static String removeStars(String s){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char ch;
        for(int i=0; i<s.length(); i++){

            ch = s.charAt(i);

            if(ch == '*'){
                stack.pop();
                continue;
            }
            stack.push(ch);
        }

        while(!stack.isEmpty()){

            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        String str = "leet**cod*e";
        String v = removeStars(str);
        System.out.println(v);
    }
}
