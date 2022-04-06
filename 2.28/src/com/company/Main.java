package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 7, m = 6, k = 0, f = 0, s = 0, l = 0, c, d;
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = i * 2;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            b[i] = i * 2 + 1;
            System.out.print(b[i] + " ");
        }
        System.out.println();
        if (n>m) {
            c = m;
            d = n;
        }
        else {
            c = n;
            d = m;
        }
        while (k < c) {
            if (a[k] <= b[k]) {
                f = a[k];
                s = b[k];
            }
            else {
                while (a[l] > b[l]) {
                    f = b[l];
                    if (l == 0) s = a[l];
                    else s = b[l-1];
                    l++;
                }
            }
            System.out.print(f + " " + s + " ");
            k++;
        }
        while (k < d) {
            System.out.print(a[k] + "");
            k++;
        }
    }
}
