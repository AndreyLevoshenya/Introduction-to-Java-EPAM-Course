package com.company;

public class Main {
    public static int n;

    public static void main(String[] args) {
	    int k = 1000;
        for (int i = 1; i <= k; i++) {
            findN(i);
            if (sum(i) == i) {
                System.out.print(i + " ");
            }
        }
    }

    public static void findN(int a) {
        n = 0;
        while (a > 0) {
            n++;
            a /= 10;
        }
    }

    public static int sum(int a) {
        int s = 0;
        while (a > 0) {
            s += Math.pow(a%10, n);
            a /= 10;
        }
        return s;
    }


}
