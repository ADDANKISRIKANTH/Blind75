package org.example.NextGreaterElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

    //Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
    //Output: [-1,3,-1]

    //step1 -> [3,4,0,0]
    //step-2 -> {1:3,3:4,4:0,2:0}
    //step-3 -> [-1,3,-1]
    public static void nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums2.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        //step-1
        for(int i=0;i<nums2.length; i++){
            while(!stack.isEmpty() && nums2[i] > nums2[stack.peek()]){
                result[stack.peek()] = nums2[i];
                stack.pop();
            }
            stack.push(i);
        }
        //step -2
        for(int i=0; i<nums2.length;i++){
            if(result[i] == 0){
                result[i] = -1;
            }
            map.put(nums2[i],result[i]);
        }
        //step-3
        //step-2 -> {1:3,3:4,4:0,2:0}
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }



        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {


        int[] arr1 = {4,1,2};
        int[] arr2 = {1,3,4,2};
        nextGreaterElement(arr1,arr2);
    }
}
