package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 9, res;
        res = sumFact(n);
        System.out.println(res);
    }

    public static int sumFact(int n) {
        int sum = 0, fact;
        for (int i = 1; i <= n ; i += 2) {
            fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            sum += fact;
        }
        return sum;
    }
}
