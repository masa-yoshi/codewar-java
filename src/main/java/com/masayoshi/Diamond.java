package com.masayoshi;

public class Diamond {
    public static String print(int n) {

        String diamond = "";

        if(n % 2 == 0 || n < 0) {
            return null;
        } else {
            //Top
            int m = n;

            for (int i = 1; i <= (n - 1)/2; i++) {

                for (int k = 1; k <= (m - 1)/2; k++) {
                    System.out.print(" ");
                    diamond += " ";
                }
                m-=2;

                for (int j = 1; j <= (2*i - 1); j++) {
                    System.out.print("*");
                    diamond += "*";
                }
                System.out.println("");
                diamond += "\n";
            }

            //Middle
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
                diamond += "*";
            }
            System.out.println("");
            diamond += "\n";

            //Bottom
            int l = 1;
            for (int i = (n - 1)/2; i >= 1; i--) {

                for (int k = 1; k <= l; k++) {
                    System.out.print(" ");
                    diamond += " ";
                }
                l++;

                for (int j = 1; j <= (2*i - 1); j++) {
                    System.out.print("*");
                    diamond += "*";
                }
                System.out.println("");
                diamond += "\n";
            }

            return diamond;
        }
    }

    public static void main(String[] args) {
        print(-1);
    }
}
