package com.company;

public class Main {

    public static void main(String[] args) {
	    int a = 1257368236, b = 86345897;
        String astr = "", bstr = "", res = "";
        astr += a;
        bstr += b;
        for (int i = 0; i < astr.length(); i++) {
            for (int j = 0; j < bstr.length(); j++) {
                if (astr.charAt(i) == bstr.charAt(j)) res += astr.charAt(i) + " ";
            }
        }
        System.out.println(res);
    }
}
