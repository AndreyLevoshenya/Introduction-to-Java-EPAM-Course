package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 50;
        boolean b = false;
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 2; j < i; j++) {
                if ((i+1)%j != 0) {
                    b = true;
                }
                else {
                    b = false;
                    break;
                }
            }
            if (b || (i+1) == 1 || (i+1) == 2 || (i+1) == 3) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
