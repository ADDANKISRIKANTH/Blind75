package org.example.arrays;

public class ContainsDuplicates {


    public static void main(String[] args) {

        boolean flag = false;
        int [] arr = {1,2,3,4};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    flag = true;
                }
            }
        }

        if(flag){
            System.out.println("contains duplicate: "+flag);
        }else{
            System.out.println("not contains duplicates");
        }
    }
}
