package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 100, z = 50, j = 0;
	    int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(100);
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > z) {
                a[i] = z;
                j++;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("amount of changes: " + j);
    }
}
