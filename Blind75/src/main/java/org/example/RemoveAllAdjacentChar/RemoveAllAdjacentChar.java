package org.example.RemoveAllAdjacentChar;

import java.util.Stack;

//Remove All Adjacent Duplicates In String
public class RemoveAllAdjacentChar {

//    you are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
//
//    We repeatedly make duplicate removals on s until we no longer can.
//
//    Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

//    Example 1:
//
//    Input: s = "abbaca"
//    Output: "ca"
//    Explanation:
//    For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

    public static String removeAdjacentChar(String str){

        StringBuilder builder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char ch;
        for(int i=0; i< str.length(); i++){
            ch = str.charAt(i);

            if(!stack.isEmpty() && ch == stack.peek()){
                stack.pop();
                continue;
            }
            stack.push(ch);
        }

        while(!stack.isEmpty()){
            builder.append(stack.pop());
        }
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "abbaca";
        String k = removeAdjacentChar(str);
        System.out.println(k);

    }
}
