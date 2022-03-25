package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 50;
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(-50, 50);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (a[i] > i) System.out.print(a[i] + " ");
        }
    }
}
