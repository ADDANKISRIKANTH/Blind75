package org.example.ReverseString;

public class ReverseString {

    public static char [] getReverseString(char [] ch){

        char temp;
        for(int i=0; i < (ch.length/2); i++){
            temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }
        return ch;
    }

    public static void main(String[] args) {
        char [] ch = {'h','e','l','l','o'};
        char[] value = getReverseString(ch);
        System.out.println(value);
    }
}
