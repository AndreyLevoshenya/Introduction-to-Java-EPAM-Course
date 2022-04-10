package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 104, b = 52, c = 204, d = 808;
        System.out.println("НОД: " + nod(a, b, c, d));
    }

    public static int nod(int a, int b, int c, int d) {
        int n = 1;
        for (int i = 1; i <= a; i++) {
            if(a%i == 0 && b%i == 0 && c%i == 0 && d%i == 0) n = i;
        }
        return n;
    }
}
