package com.company;

public class Main {

    public static void main(String[] args) {
	    int n = 15, k = 0, max, p, j = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i * 2;
            System.out.print(a[i] + " ");
        }

        while (k < n/2) {
            max = Integer.MIN_VALUE;
            for (int i = k; i < n-k; i++) {
                if (a[i] > max){
                    max = a[i];
                    j = i;
                }
            }
            p = a[k];
            a[k] = max;
            a[j] = p;
            k++;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
