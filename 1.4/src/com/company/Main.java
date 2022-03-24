package com.company;

public class Main {

    public static void main(String[] args) {
	    double r = 111.222;
        String str = "";
        str += r;
        char[] n = new char[7];
        for (int i = 0; i < 7; i++) {
            n[i] = str.charAt(i);
        }
        for (int i = 6; i >= 0; i--) {
            System.out.print(n[i]);
        }
    }
}
