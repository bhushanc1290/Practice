package com.bhushan.DSA.Arrays;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {
        List<Integer> mylist= new ArrayList<>();
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);
        System.out.println(mylist);
        mylist.add(50);
        System.out.println(mylist);
    }
}
