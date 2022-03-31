package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 20, m = 10, k;
        int[][] a = new int[n][m];
        int[] r = new int[m];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = random.nextInt(2);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1) {
                    r[j]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                while (r[j] < j) {
                    k = random.nextInt(n);
                    if (a[k][j] == 0) {
                        a[k][j] = 1;
                        r[j]++;
                    }
                }
                while (r[j] > j) {
                    k = random.nextInt(n);
                    if (a[k][j] == 1) {
                        a[k][j] = 0;
                        r[j]--;

                    }
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
