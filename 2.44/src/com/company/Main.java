package com.company;

public class Main {

    public static void main(String[] args) {
	    int n = 324234, k = 1, m = n;
        while (m/10 != 0) {
            k++;
            m /= 10;
        }
        int[] a = new int[k];
        for (int i = k-1; i >= 0; i--) {
            a[i] = n%10;
            n /= 10;
        }
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
