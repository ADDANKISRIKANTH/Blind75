package org.example.MissingNumber;

public class NumberMissing {

    public static int getMissingNum(int [] arr){
        int temp = -1;
        for(int i=0; i<arr.length-1; i++){
            if(i != arr[i]){
                temp = i;
                break;
            }
        }
        return temp != -1 ? temp : arr.length;
    }

    public static void main(String[] args) {
        int [] arr = {0,2,3,4};
        int value = getMissingNum(arr);
        System.out.println(value);
    }
}
