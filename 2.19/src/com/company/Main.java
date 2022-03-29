package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 5, max = Integer.MIN_VALUE;
        int[][] a = new int[n][n];
        int [] sum = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                sum[j] += a[i][j];
            }
            System.out.print(sum[j] + " ");
        }
        for (int i = 0; i < n; i++) {
            if (sum[i] > max) max = sum[i];
        }
        System.out.println("\n" + max);
    }
}
