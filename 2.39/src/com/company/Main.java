package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    int n = 10, res;
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        res = calculateMax2(a);
        System.out.println(res);
    }
    public static int calculateMax2(int[] a) {
        int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int j : a) {
            if (j > max) {
                max2 = max;
                max = j;
            }
        }
        return max2;
    }
}
