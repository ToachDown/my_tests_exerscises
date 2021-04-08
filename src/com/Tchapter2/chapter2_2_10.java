package com.Tchapter2;

import java.util.Scanner;

public class chapter2_2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int N = input.nextInt();
        int M = input.nextInt();
        array = new int[N][M];

        for (int i = 0; i < N; i++) {  // заполняю массив
            for (int j = 0; j < M; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(i == j && array[i][j] > 0){
                    System.out.println(" element :" + (int)(i+1) + " is " + array[i][j]);
                }
            }
        }
    }
}
