package com.Tchapter2;

import java.util.Scanner;

public class chapter2_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter array size N");
        int N = input.nextInt();
        int[] array = new int[N];
        int counter = 0;
        int switcher;

        for(int i = 0; i< N; i++){
            System.out.println("array[" + i + "] = ");
            array[i] = input.nextInt();
        }

        for(int i = 1; i < N ; i++){
            array[i] = 0;
            for (int j = i; j < N-1; j++){
                switcher = array[j];
                array[j] = array[j+1];
                array[j+1] = switcher;
            }
        }

        for(int i = 0; i < counter ; i++){
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
