package com.bhushan.DSA.Recursion;

public class Lab5 {
    public static void main(String[] args) {

        show(5);
    }

    static void show(int n) {


        //Logic
        System.out.println("Hello guys");
        //base condition
        if (n == 0) {
            return;
        }
        //recurssive call
        show(n - 1);

    }
}
