package com.bhushan.DSA.Arrays;
//delete the element at specific position
public class Program6 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int position =3;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        deleteAt(arr,position);
        System.out.println("-------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void deleteAt(int[] arr, int position) {
        int index = position-1;
        int n = arr.length-1;
        for (int i = index; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1]=0;
    }
}
