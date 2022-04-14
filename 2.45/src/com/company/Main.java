package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 1111111, b = 999999;
        func(a, b);
    }

    public static void func(int a, int b) {
        while (a/10 != 0 && b/10 != 0) {
            a /= 10;
            b /= 10;
        }
        if (a/10 == 0 && b/10 == 0) System.out.println("a and b have the same digit");
        if (a/10 == 0) System.out.println("digit of b is bigger then digit of a");
        if (b/10 == 0) System.out.println("digit of a is bigger then digit of b");
    }
}
