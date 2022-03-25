package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    int n = 10, k = 7, sum = 0;
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(1000);
            System.out.println(a[i]);
            if (a[i] % k == 0) sum += a[i];
        }
        System.out.println("\n" + sum);
    }
}
