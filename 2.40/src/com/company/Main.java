package com.company;

public class Main {

    public static void main(String[] args) {
	    int a = 3, b = 4, c = 8;
        isCoprime(a, b, c);
    }

    public static void isCoprime(int a, int b, int c) {
        int n = 1;
        for (int i = 1; i <= a; i++) {
            if(a%i == 0 && b%i == 0) n = i;
        }
        if (n == 1) System.out.println(a + ", " + b +", " +  c + " are coprimes numbers");
        else System.out.println(a + ", " + b +", " +  c + " aren't coprimes numbers");
    }
}
