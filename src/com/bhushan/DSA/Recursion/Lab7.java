package com.bhushan.DSA.Recursion;

//Print Numbers from N to 1
public class Lab7 {
    public static void main(String[] args) {
        printNum(5);
    }

    private static void printNum(int i) {
        //base condition
        if (i == 0) {
            return;
        }

        //logics
        System.out.println(i);

        //recursive call
        printNum(i - 1);

    }
}
