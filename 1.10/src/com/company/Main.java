package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        if (x <= 3) y = Math.pow(x, 2) - 3 * x +9;
        else y = 1 / (Math.pow(x, 3) + 6);
        System.out.println(y);
    }
}
