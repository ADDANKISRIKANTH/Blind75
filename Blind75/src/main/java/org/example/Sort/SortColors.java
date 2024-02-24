package org.example.Sort;

import java.util.Arrays;

public class SortColors {

    public static void sortColors(int [] nums){

        int i=0;
        int j=0;
        int k = nums.length-1;

        while(j<=k){

            if(nums[j] == 0){
                swap(nums,i,j);
                i++;
                j++;
            } else if (nums[j] == 1) {
                j++;
            }else{
                swap(nums,j,k);
                k--;
            }
        }
    }

    private static void swap(int [] nums,int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void main(String[] args) {
        int [] colors = {2,0,2,1,1,0};

        sortColors(colors);

        System.out.println(Arrays.toString(colors));
    }
}
