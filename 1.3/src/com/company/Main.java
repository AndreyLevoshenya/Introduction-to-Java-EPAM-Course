package com.company;

public class Main {

    public static void main(String[] args) {
	    double x = 0.81, y = -0.77;
        System.out.println((Math.sin(x) + Math.cos(y)) /
                (Math.sin(x) - Math.cos(y)) * Math.tan(x * y));
    }
}
