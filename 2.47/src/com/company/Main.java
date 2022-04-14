package com.company;

public class Main {

    public static void main(String[] args) {
	    int n = 100, k = 0;
        boolean bool;
        int[] a = new int[n/2];
        for (int i = n; i < 2*n; i++) {
            bool = true;
            for (int j = 2; j < i; j++) {
                if(i%j == 0) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                a[k] = i;
                k++;
            }
        }
        for (int i = 0; i < k - 1; i++) {
        if (a[i+1] - 2 == a[i]) System.out.println(a[i] + " " + a[i+1]);
        }
    }
}
