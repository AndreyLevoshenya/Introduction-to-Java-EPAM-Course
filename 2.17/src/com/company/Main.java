package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 7, k = 0;
        double[][] a = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.sin((double) (i - j) / n);
                System.out.print(a[i][j] + " ");
                if(a[i][j] > 0) k++;
            }
            System.out.println();
        }
        System.out.println(k);
    }
}
