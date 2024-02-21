package org.example.ContainsDuplicates;

import java.util.HashMap;
import java.util.Map;

public class BetterApproachContainsDuplicates {

    private static boolean containsDuplicateElements(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                flag = true;
            } else {
                map.put(arr[i], i);
            }
        }
        System.out.println(map);
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
