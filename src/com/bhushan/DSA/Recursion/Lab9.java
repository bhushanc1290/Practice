package com.bhushan.DSA.Recursion;

//Factorial of number
public class Lab9 {
    public static void main(String[] args) {

        int res = fact(4);
        System.out.println(res);
    }

    private static int fact(int i) {
        if (i == 0 || i == 1) {
            return 1;
        }
        return i * fact(i - 1);
    }
}
