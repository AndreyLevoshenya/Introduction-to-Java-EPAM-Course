package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 3, sum = 0, evens;
        int initialN = initialNum(n);
        int lastN = initialNum(n+1) -1;
        for (int i = initialN; i <= lastN; i++) {
            if (isAllOdd(i)) sum += i;
        }
        evens = howManyEvens(sum);
        System.out.println(sum + " - " + evens + " even numbers");
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

    public static boolean isAllOdd(int a) {
        boolean odd = true;
        while (a > 0) {
            if (a%10%2 == 0) {
                odd = false;
                break;
            }
            a /= 10;
        }
        return odd;
    }

    public static int howManyEvens(int a) {
        int evens = 0;
        while (a > 0) {
            if (a%10%2 == 0) evens++;
            a /= 10;
        }
        return evens;
    }
}
