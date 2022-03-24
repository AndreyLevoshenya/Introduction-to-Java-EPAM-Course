package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int d1, d2;
        Scanner scanner = new Scanner(System.in);
        d1 = scanner.nextInt();
        d2 = scanner.nextInt();
        if(d1 + d2 >= 180) {
            System.out.println("it cannot be a triangle");
        }
        else  {
            if (180 - d1 - d2 == 90 || d1 == 90 || d2 == 90) {
                System.out.println("triangle is right");
            }
            else System.out.println("triangle isn't right");
        }
    }
}
