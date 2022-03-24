package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
	    double e = scanner.nextDouble(), an, sum = 0;
        do {
            an = 1/Math.pow(2, n) + 1/Math.pow(3, n);
            sum += an;
            n++;
        }
        while (an >= e);
        System.out.println(sum);
    }
}
