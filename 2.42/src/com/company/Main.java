package com.company;

public class Main {

    public static void main(String[] args) {
	    int n = 10;
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = i * 2;
            System.out.print(d[i] + " ");
        }
        System.out.println();
        int[] sum;
        sum = sum(d);
        for (int i = 0; i <d.length/3 + 1; i++) {
            System.out.print(sum[i] + " ");
        }

    }

    public static int[] sum(int[] x) {
        int k = 0;
        int[] s = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            s[k] += x[i];
            if ((i+1)%3 == 0) {
                k++;
            }
        }
        return s;
    }
}
