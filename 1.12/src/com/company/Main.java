package com.company;

public class Main {

    public static void main(String[] args) {
	    double x, y, a = -5, b = 3, h = 0.5;
        x = Math.min(a,b);
        while (x <= Math.max(a,b)) {
            if (x > 2) y = x;
            else y = -x;
            System.out.println(y);
            x+=h;
        }
    }
}
