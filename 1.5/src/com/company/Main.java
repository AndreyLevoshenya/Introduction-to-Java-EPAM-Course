package com.company;

public class Main {

    public static void main(String[] args) {
	    int t = Integer.MAX_VALUE, h, m, s;
        h = (int) Math.floor((double) t / 3600);
        m = (int) Math.floor((double) (t - h * 3600) / 60);
        s = (int) Math.floor((double) t - h * 3600 - m * 60);
        System.out.println(h + "h " + m + "m " + s + "s");
    }
}
