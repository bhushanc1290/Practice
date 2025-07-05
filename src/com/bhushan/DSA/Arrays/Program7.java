package com.bhushan.DSA.Arrays;
//delete the element if its is found
//first we need to search a element and return the index then we need
public class Program7 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] =60;

        int element=40;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int index = linearSearch(arr,40);
        System.out.println("index at element found " +index);
        if(index != -1){
            deleteAt(arr,index);
        }
        //deleteAt(arr,position);
        System.out.println("-------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void deleteAt(int[] arr, int position) {
        System.out.println("position at which element is deleted"+position);
        int index = position;
        int n = arr.length;
        System.out.println( "size of array " + n);
        for (int i = index; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1]=0;
    }
    private static int linearSearch(int[] arr,int element){

        int n = arr.length;
        for (int i = 0; i < n; i++) {

            if(element == arr[i]){
                return i;
            }
        }
        return  -1;
    }
}
