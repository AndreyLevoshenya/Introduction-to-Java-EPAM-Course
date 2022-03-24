package com.company;

public class Main {

    public static void main(String[] args) {
	    double a = 4, b = 5, c = 6, d = 7, x, y, z;
        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
        if (a < b) x = a;
        else x = b;
        if (c < d) y = c;
        else y = d;
        if (x > y) z = x;
        else  z = y;
        System.out.println(z);
    }
}
