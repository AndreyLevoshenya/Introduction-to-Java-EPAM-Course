package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	    BigInteger m = BigInteger.valueOf(1);
        long n;
        for (int i = 1; i <= 200; i++) {
            n = i * i;
            m = m.multiply(BigInteger.valueOf(n));
        }
        System.out.println(m);
    }
}
