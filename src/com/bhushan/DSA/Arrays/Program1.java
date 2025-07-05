package com.bhushan.DSA.Arrays;

public class Program1 {
    public static void main(String[] args) {

       //1.creating an array
        int arr[] = new int[5];

        //2.find the length of an array
        int n= arr.length;
        System.out.println(n);

        //3.access element of array
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i] +" ");
            System.out.println();
        }
        //4.Innitiatilise the array
        arr[0]=11;
        arr[1]=12;
        arr[2]=24;
        arr[3]=45;
        System.out.println("-----------------------");

        //Access Element of array
        for (int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
