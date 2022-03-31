package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 10, m = 20, p, b, k;
        int[][] a = new int[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = random.nextInt(100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b = 0;
                while (b < m) {
                    k = b;
                    while (k > 0 && a[i][k-1] >= a[i][k]) {
                        p = a[i][k-1];
                        a[i][k-1] = a[i][k];
                        a[i][k] = p;
                        k--;
                    }
                    ++b;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b = 0;
                while (b < m) {
                    k = b;
                    while (k > 0 && a[i][k-1] <= a[i][k]) {
                        p = a[i][k-1];
                        a[i][k-1] = a[i][k];
                        a[i][k] = p;
                        k--;
                    }
                    ++b;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
