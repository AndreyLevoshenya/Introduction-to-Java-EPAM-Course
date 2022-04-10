package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    int n = 10;
        double res;
        Random random = new Random();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = random.nextInt(-20, 20);
            y[i] = random.nextInt(-20, 20);
            System.out.print(i+1 + ". (" + x[i] + ", " + y[i] + ")  ");
        }
        System.out.println();
        res = maxLength(x, y);
        System.out.println(res);
    }

    public static double maxLength(int[] x, int[] y) {
        double maxL = 0, p;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < y.length; j++) {
                p = Math.sqrt(Math.pow(x[j] - x[i], 2) + Math.pow(y[j] - y[i], 2));
                if (p >= maxL) {
                    maxL = p;
                }
            }
        }
        return maxL;
    }
}
