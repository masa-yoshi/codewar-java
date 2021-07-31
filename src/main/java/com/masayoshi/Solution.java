package com.masayoshi;

public class Solution {
    public static int zeros(int n) {
        // your beautiful code here
        if (n == 0) return 0;
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a *= i;
        }

        char charArray[] = (String.valueOf(a) + "1").toCharArray();
        int cnt = 0;
        int trailing = 0;
        for (char c : charArray) {
            if (c == '0') cnt += 1;
            else {
                if (cnt > trailing) trailing = cnt;
                cnt = 0;
            }
        }

        return trailing;
    }

    public static void main(String[] args) {
//        System.out.println(zeros(12));
        System.out.println(zeros(14));
    }
}
