package com.bhushan.DSA.Recursion;

//Print Numbers from  1 to N
public class Lab6 {
    public static void main(String[] args) {
        printNum(5);
    }

    private static void printNum(int i) {
        //base condition
        if (i == 0) {
            return;
        }
        //recursive call
        printNum(i - 1);
        //logics
        System.out.println(i);

    }
}
