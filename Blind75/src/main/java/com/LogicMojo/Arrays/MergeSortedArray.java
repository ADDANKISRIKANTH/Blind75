package com.LogicMojo.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeSortedArray {

    public static List<Integer> sortedArray(int[] a, int[] b) {

        int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;

        List<Integer> list = new ArrayList<>(c1);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a1; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }

        }
        for (int i = 0; i < b1; i++) {
            if (map.containsKey(b[i])) {
                map.put(b[i], map.get(b[i]) + 1);
            } else {
                map.put(b[i], 1);
            }

        }
        for (Map.Entry<Integer, Integer> val : map.entrySet()) {
            list.add(val.getKey());
        }
        System.out.println(list);
        return list;

    }

    public static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void main(String[] args) {
        int[] a = {3, 3, 4, 5, 6, 7, 8, 9, 9, 9};
        int[] b = {2, 4, 5};
        List<Integer> lis = sortedArray(a, b);
        System.out.println(lis);
    }
}
