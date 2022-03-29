package com.company;

import java.util.Random;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter k: (<5)");
        int k = scanner.nextInt();
        System.out.println("Enter p: (<5)");
        int p = scanner.nextInt();
        int t;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == k) {
                    t = a[i][j];
                    a[i][j] = a[i][p];
                    a[i][p] = t;
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
