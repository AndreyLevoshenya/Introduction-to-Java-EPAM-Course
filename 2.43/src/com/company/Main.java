package com.company;

public class Main {

    public static void main(String[] args) {
        double x = 8, y = 6, z = 10, t = 5;
        System.out.println(square(x, y, z, t));
    }

    public static double square(double a, double b, double c, double d) {
        double s = 0;
        s += a * b / 2;
        double d1 = Math.sqrt(a * a + b * b);
        double p = (d1 + c + d)/2;
        s += Math.sqrt(p * (p - d1) * (p - c) * (p - d));
        return s;
    }
}
