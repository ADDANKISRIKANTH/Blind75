package org.example.ValidateParenthesis;

import java.util.Stack;

public class validateParenthesis {


    public static boolean validate(String s){

        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }else{

                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if((ch == '}' && top != '{') || (ch == ']' && top != '[') || (ch == ')' && top != '(')){
                    return false;
                }
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {

        String str = "((";
        boolean k = validate(str);
        System.out.println(k);
    }
}
