package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    int n = 10, oz = 1, r;
        boolean b;
        Random random = new Random();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = random.nextInt(1,10);
            q[i] = random.nextInt(1,10);
            System.out.print(p[i] + "/" + q[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            b = true;
            for (int j = 0; j < i; j++) {
                if (q[i] == q[j]) {
                    b = false;
                    break;
                }
            }
            if (b) oz *= q[i];
        }
        System.out.println(oz);
        for (int i = 0; i < n; i++) {
            p[i] = p[i] * oz / q[i];
            System.out.print(p[i] + "/" + oz + " ");
        }
        System.out.println();
        for (int i = 1; i < n; i++) {//bubble sort
            for (int j = 1; j < n; j++) {
                if (p[j] < p[j-1]) {
                    r = p[j-1];
                    p[j-1] = p[j];
                    p[j] = r;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + "/" + oz + " ");
        }
    }
}
