package org.example.MaxConsicutiveNumber;

public class MaxConsicutive {

    private static int getMaxConsicutiveOnes(int [] arr){
        int ans = 0;
        int count=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] == 1){
                count++;
            }else{
                ans = (ans>count) ? ans:count;
                count = 0;
            }
        }
        return (ans>count) ? ans :count;
    }
    public static void main(String[] args) {

        int [] arr = {0,1,1,0,1,1,1,0,1,0,0,0,1,1,1,1};
        int value = getMaxConsicutiveOnes(arr);
        System.out.println(value);

    }
}
