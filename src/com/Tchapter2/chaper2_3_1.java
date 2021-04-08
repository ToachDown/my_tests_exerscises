package com.Tchapter2;

import java.util.Scanner;

public class chaper2_3_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int k;
        int[] arrayOne = new int[N+M+5];
        int[] arrayTwo = new int[M];

        for(int i = 0; i < N; i++){
            arrayOne[i] = (int)(Math.random()*50);
            System.out.println("x[" + i + "] = " + arrayOne[i]);
        }
        System.out.println("----------------");
        for(int i = 0; i < M; i++){
            arrayTwo[i] = (int)(Math.random()*50);
            System.out.println("x[" + i + "] = " + arrayTwo[i]);
        }
        System.out.println("----------------");
        System.out.println("write k < " + N + " :");
        k = input.nextInt();
        for(int i = 0; i < N-k ;i++){
                arrayOne[k+M+i] = arrayOne[k+i];
        }
        for(int i = 0; i < M; i++){
            arrayOne[k+1+i] = arrayTwo[i];
        }
        for(int i = 0; i< N+M;i++){
            System.out.println("x[" + i + "] = " + arrayOne[i]);
        }
    }
}
