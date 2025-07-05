package com.bhushan.DSA.Recursion;

//Tail Recursion
public class Lab3 {
    public static void main(String[] args) {

        show(5);
    }

    static void show(int n) {
        //base condition
        if (n == 0) {
            return;
        }
        //Logic
        System.out.println("Hello guys");
        //recurssive call
        show(n - 1);

    }
}
