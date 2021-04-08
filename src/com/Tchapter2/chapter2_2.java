package com.Tchapter2;

import java.util.Scanner;

public class chapter2_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter array size");
        int[] array = new int[input.nextInt()];
        System.out.println("enter number Z");
        int Z = input.nextInt();
        int counter = 0;

        for(int i = 0; i<array.length; i++){
            System.out.println("array[" + i + "] = ");
            array[i] = input.nextInt();
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] > Z){
                array[i] = Z;
                counter++;
            }
        }

        System.out.println("number replace =" + counter);
        for (int i = 0; i< array.length;i++){
            System.out.println("array[" + array[i] + "]");
        }
    }
}
