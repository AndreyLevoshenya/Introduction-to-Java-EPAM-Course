package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j < n - i) a[i][j] = i + 1;
                else a[i][j] = 0;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
