package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        System.out.println((y > 0 && y <= 4 && x >= -2 && x <= 2) || (y <= 0 && y >= -3 && x >= -4 && x <= 4));
    }
}
