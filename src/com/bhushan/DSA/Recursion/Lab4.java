package com.bhushan.DSA.Recursion;

//Non-Tail Recursion
public class Lab4 {
    public static void main(String[] args) {

        show(5);
    }

    static void show(int n) {
        //base condition
        if (n == 0) {
            return;
        }
        //recurssive call
        show(n - 1);
        //Logic
        System.out.println("Hello guys");


    }
}
