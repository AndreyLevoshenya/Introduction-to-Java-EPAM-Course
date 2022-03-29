package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2 == 0) a[i][j] = j + 1;
                else a[i][j] = n-j;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
