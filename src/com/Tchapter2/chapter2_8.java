package com.Tchapter2;

import java.util.Scanner;

public class chapter2_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter array size N");
        int N = input.nextInt();
        int[] array = new int[N];
        int min;
        int M = 0;
        int[] arrayResult = new int[N];

        for(int i = 0; i< N; i++){
            System.out.println("array[" + i + "] = ");
            array[i] = input.nextInt();
        }

        min = array[0];

        for(int i = 1 ; i < N; i++){
            if(min > array[i]){
                min = array[i];
            }
        }

        for(int i = 0; i < N; i++){
            if(array[i] != min){
                arrayResult[M] = array[i];
                M++;
            }
        }

        for(int i = 0; i < M ; i++){
            System.out.println("array[" + i + "] = " + arrayResult[i]);
        }
    }
}
