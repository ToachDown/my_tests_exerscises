package com.Tchapter2;

import java.util.Scanner;

public class chapter2_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter array size N");
        int N = input.nextInt();
        int[] array = new int[N];

        for(int i = 0; i< N; i++){
            System.out.println("array[" + i + "] = ");
            array[i] = input.nextInt();
        }

        for(int i = 0; i < N ; i++){
            if(array[i] > i){
                System.out.println(array[i]);
            }
        }

    }
}
