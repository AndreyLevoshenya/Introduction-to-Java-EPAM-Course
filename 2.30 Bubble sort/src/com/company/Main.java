package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 100, p, k = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i * 2;
            System.out.print(a[i] + " ");
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (a[j] > a[j-1]) {
                    p = a[j-1];
                    a[j-1] = a[j];
                    a[j] = p;
                    k++;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\namount of permutations: " + k);
    }
}
