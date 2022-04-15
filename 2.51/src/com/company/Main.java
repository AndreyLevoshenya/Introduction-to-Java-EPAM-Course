package com.company;

public class Main {

    public static void main(String[] args) {
	    int n = 1212;
        System.out.println(func(n));
    }

    public static int howManyNums(int a) {
        int p = 0;
        while (a > 0) {
            p++;
            a /= 10;
        }
        return p;
    }

    public static int func(int n) {
        int k = 0;
        int h = howManyNums(n);
        while (n > 0) {
            n -= h;
            k++;
        }
        return k;
    }
}
