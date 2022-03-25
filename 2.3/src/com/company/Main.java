package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 50, n0 = 0, m = 0, p = 0;
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(-100, 100);
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            if(a[i] < 0) m++;
            else if (a[i] == 0) n0++;
            else p++;
        }
        System.out.println("\namount of positive elements: " + p);
        System.out.println("amount of zero elements: " + n0);
        System.out.println("amount of negative elements: " + m);
    }
}
