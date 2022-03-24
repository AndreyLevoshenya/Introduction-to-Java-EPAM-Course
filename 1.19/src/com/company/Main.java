package com.company;

public class Main {

    public static void main(String[] args) {
	    int a = 3, b = 4;
        int x = 2, y = 5, z = 2;
        if ((x < a && y < b) || (x < a && z < b) || (y < a && x < b) ||
                (y < a && z < b) || (z < a && y < b) || (z < a && x < b)) {
            System.out.println("Кирпич пройдет!");
        }
        else System.out.println("Кирпич не пройдет!");
    }
}
