package org.example.arrays.ContainsDuplicates;

public class ContainsDuplicates {

    private static boolean containsDuplicateElements(int[] arr) {

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        if (containsDuplicateElements(arr)) {
            System.out.println("contains duplicate: ");
        } else {
            System.out.println("not contains duplicates");
        }
    }
}
