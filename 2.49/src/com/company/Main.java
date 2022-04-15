package com.company;

public class Main {

    public static void main(String[] args) {
	    int n = 2;
        int initialN = initialNum(n);
        int lastN = initialNum(n+1) -1;
        for (int i = initialN; i <= lastN; i++) {
            if(isIncrease(i)) System.out.print(i + " ");
        }
    }

    public static int initialNum(int n) {
        int inNum;
        String num = "1";
        for (int i = 1; i < n; i++) {
            num += "0";
        }
        inNum = Integer.parseInt(num);
        return inNum;
    }

    public static boolean isIncrease(int a) {
        boolean isInc = true;
        int p;
        p = a%10;
        a /= 10;
        while (a>0) {
            if(a%10 >= p) {
                isInc = false;
                break;
            }
            a /= 10;
        }
        return isInc;
    }
}
