package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    int n = 10, max = Integer.MIN_VALUE;
        int[] a = new int[2*n];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if(a[i] + a[2*n-i-1] > max) max = a[i] + a[2*n-i-1];
            System.out.println("a[" + i + "] + a[" + (2*n-i-1) + "] = " + (a[i] + a[2*n-i-1]));
        }
        System.out.println(max);
    }
}
