package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    int n = 15, step;
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
        step = n/2;
        while (step > 0) {
            for (int i = step; i < n; i++) {
                for (int j = i - step; j >= 0 && a[j] > a[j+step]; j -= step) {
                    int p = a[j];
                    a[j] = a[j+step];
                    a[j+step] = p;
                }
            }
            step--;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
