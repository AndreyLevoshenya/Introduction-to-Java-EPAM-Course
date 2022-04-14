package com.company;

public class Main {

    public static void main(String[] args) {
	    int k = 19, n = 1000;
        for (int i = 0; i < n/10-2*k+1; i++) {
            System.out.print(func(k, n)[i] + " ");
        }

    }
    public static int[] func(int k, int n) {
        int[] a = new int[n/10-2*k+1];
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (sum(i) == k) {
                a[j] = i;
                j++;
            }
        }
        System.out.println(j);
        return a;
    }
    public static int sum(int a) {
        int s = 0;
        while (a > 0) {
            s += a%10;
            a /= 10;
        }
        return s;
    }
}
