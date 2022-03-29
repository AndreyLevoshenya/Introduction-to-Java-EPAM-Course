package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 7;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i < j && i > n-j-1) || (i > j && i < n-1-j)) a[i][j] = 0;
                else a[i][j] = 1;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
