package com.company;

import java.util.Scanner;

public class Main {
//только для нечетных порядков
    public static void main(String[] args) {
        int n, m = 4;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[][] a = new int[n][n];
        if (n%2 != 0) {
            int b = 0, c = n/2;
            a[b][c] = 1;
            for (int i = 2; i <= n*n; i++) {
                b--;
                if (b < 0) b = n - 1;
                c++;
                if (c == n) c = 0;
                if (a[b][c] != 0) {
                    c--;
                    if (c < 0) c = n - 1;
                    b++;
                    if (b == n) b = 0;
                    b++;
                    if (b == n) b = 0;
                }
                a[b][c] = i;
            }
        }
        else {
            for (int i = 0; i < n/2; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && i != (n-1-j) && n/4 == 1 || (i != n/2-j-1 && i != j-n/2)) a[i][j] = 1;




                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
