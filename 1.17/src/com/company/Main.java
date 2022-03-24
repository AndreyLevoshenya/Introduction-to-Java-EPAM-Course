package com.company;

public class Main {

    public static void main(String[] args) {
	    int m = 50, n = 60;
        for (int i = m; i <= n; i++) {
            System.out.println(i);
            for (int j = 1; j < i; j++) {
                if (i%j == 0 && j != 1) System.out.println("\t" + i/j);
            }
        }
    }
}
