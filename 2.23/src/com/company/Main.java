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

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b = 0;
                while (b < n) {
                    k = b;
                    while (k > 0 && a[k-1][i] >= a[k][i]) {
                        p = a[k-1][i];
                        a[k-1][i] = a[k][i];
                        a[k][i] = p;
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

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b = 0;
                while (b < n) {
                    k = b;
                    while (k > 0 && a[k-1][i] <= a[k][i]) {
                        p = a[k-1][i];
                        a[k-1][i] = a[k][i];
                        a[k][i] = p;
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
