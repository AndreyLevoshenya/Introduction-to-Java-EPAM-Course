package com.company;

public class Main {

    public static void main(String[] args) {
	    int n = 10, m = 7, k = 4;
        int[] a = new int[n];
        int[] b = new int[m];
        a[0] = 1;
        System.out.print(a[0] + " ");
        for (int i = 1; i < n; i++) {
            a[i] = a[i-1] * 2;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        b[0] = 128;
        System.out.print(b[0] + " ");
        for (int i = 1; i < m; i++) {
            b[i] = b[i-1] / 2;
            System.out.print(b[i] + " ");
        }
        System.out.println();
        for (int i = 0; i <= n; i++) {
            if (i < k) {
                System.out.print(a[i] + " ");
            }
            else if (i == k){
                for (int j = 0; j < m; j++) {
                    System.out.print(b[j] + " ");
                }
            }
            else System.out.print(a[i-1] + " ");
        }
    }
}
