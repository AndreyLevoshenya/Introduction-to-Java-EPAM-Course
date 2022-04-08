package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 10, m = 5;
        int[] a = new int[n];
        int[] b = {7, 8, 9, 10, 54};
        for (int i = 0; i < n; i++) {
            a[i] = i * 3;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.print("Positions: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i] < a[j]){
                    System.out.print(j + " ");
                    break;
                }
                if (b[i] > a[n-1]) {
                    System.out.print(n + " ");
                    break;
                }
            }

        }
    }
}
