package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 10, min = Integer.MAX_VALUE, m = 0;
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(1, 5);
            System.out.print(a[i] + " ");
            if(a[i] < min) min = a[i];
        }
        for (int k : a) {
            if (k == min) m++;
        }
        System.out.println();
        System.out.println(min);
        int[] b = new int[n-m];
        for (int i = 0, j = 0; i < a.length; i++) {
            if(a[i] != min) {
                b[j] = a[i];
                j++;
            }
        }
        for (int j : b) {
            System.out.print(j + " ");
        }
    }
}
