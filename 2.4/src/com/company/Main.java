package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 10, min = Integer.MAX_VALUE, imin = 0, max = Integer.MIN_VALUE, imax = 0;
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(-100, 100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if(a[i] > max) {
                max = a[i];
                imax = i;
            }
            if(a[i] < min) {
                min = a[i];
                imin = i;
            }
        }
        a[imin] = max;
        a[imax] = min;
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
