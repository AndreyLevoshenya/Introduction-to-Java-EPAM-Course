package com.company;

public class Main {

    public static void main(String[] args) {
	    double a = 1, b = 5, c = -6;
        System.out.println((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) /
                (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
    }
}
