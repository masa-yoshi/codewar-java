package com.masayoshi;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FindOdd {
    public static int findIt(int[] a) {

        HashMap<Integer, Integer> countElement = new HashMap<Integer, Integer>();

        for (int i = 0; i < a.length; i++) {
            if (!countElement.containsKey(a[i])) {
                countElement.put(a[i], 1);
            } else {
                countElement.put(a[i], countElement.get(a[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : countElement.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int a[] = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        System.out.println(findIt(a));

        System.out.println(1^1^1);
        System.out.println(3^2);
        System.out.println(3^0);
    }
}