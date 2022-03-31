package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 10, m = 20, k;
        int[][] a = new int[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = random.nextInt(15);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            k = 0;
            for (int j = 0; j < m; j++) {
                if(a[i][j] == 5) k++;
            }
            if (k >= 3) System.out.println("Str №" + i);
        }
    }
}
