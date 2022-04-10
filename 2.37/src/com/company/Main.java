package com.company;

public class Main {

    public static void main(String[] args) {
	    int a = 5;
        double res;
        res = square(a);
        System.out.println(res);
    }
    public static double square(int a) {
        double ssix, sthree;
        sthree = Math.sqrt(3) * a * a /4;
        ssix = 6 * sthree;
        return ssix;
    }
}
