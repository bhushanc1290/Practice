package com.bhushan.DSA.Recursion;

//Find the sum of Numbers from 1 to N
public class Lab8 {
    public static void main(String[] args) {
        int sum = sumOfNumber(5);
        System.out.println(sum);
    }

    private static int sumOfNumber(int i) {
        if (i == 0) {
            return 0;
        }
        //logics
        return i + sumOfNumber(i - 1);
    }
}
//Non-Tail Recursive
//Time Complexity : O(n)
//Aux Space Complexity : O(1)