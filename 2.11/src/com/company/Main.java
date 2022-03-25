package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j%2 == 0 && a[1][j] > a[n-1][j]) System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
