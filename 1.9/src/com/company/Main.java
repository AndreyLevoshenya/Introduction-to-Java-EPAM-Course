package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    double xa, ya, xb, yb, xc, yc;
        System.out.println("enter A(x, y): ");
        xa = scanner.nextDouble();
        ya = scanner.nextDouble();
        System.out.println("enter B(x, y): ");
        xb = scanner.nextDouble();
        yb = scanner.nextDouble();
        System.out.println("enter C(x, y): ");
        xc = scanner.nextDouble();
        yc = scanner.nextDouble();
        if (xa < xb && xa < xc) {
            if ((xb-xa)/(yb-ya) == (xc-xa)/(yc-ya)) System.out.println("points are on the same line");
            else System.out.println("points aren't on the same line");
        }
        if (xb < xa && xb < xc) {
            if ((xa-xb)/(ya-yb) == (xc-xb)/(yc-yb)) System.out.println("points are on the same line");
            else System.out.println("points aren't on the same line");
        }
        if (xc < xa && xc < xb) {
            if ((xa-xc)/(ya-yc) == (xb-xc)/(yb-yc)) System.out.println("points are on the same line");
            else System.out.println("points aren't on the same line");
        }
    }
}
