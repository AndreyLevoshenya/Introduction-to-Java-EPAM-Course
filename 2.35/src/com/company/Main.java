package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 104, b = 52;
        System.out.println("НОД: " + nod(a, b));
        System.out.println("НОК:" + nok(a, b, nod(a, b)));
    }
    public static int nod(int a, int b) {
        int n = 1;
        for (int i = 1; i <= a; i++) {
            if(a%i == 0 && b%i == 0) n = i;
        }
        return n;
    }
    public static int nok(int a, int b, int nod) {
        int n;
        n = a * b / nod;
        return n;
    }
}
