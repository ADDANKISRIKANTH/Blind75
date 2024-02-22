package org.example.sum;

import java.util.Arrays;

public class BruteForceTwoSum {

    private static int[] getTwoSum(int[] arr,int target){
        int [] nums = new int[2];
        int count=0;
        for(int i=1; i<arr.length; i++){
            int sum = arr[count]+arr[i];
            if(sum == target){
                nums[0] = count;
                nums[1] = i;
            }
            count++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] a = {3,2,4};
        int [] val = getTwoSum(a,6);
        System.out.println(Arrays.toString(val));
    }
}
