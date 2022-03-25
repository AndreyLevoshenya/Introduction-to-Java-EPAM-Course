package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if(i%2 != 0) {
                a[i] = 0;
            }
            System.out.print(a[i] + " ");
        }
    }
}
