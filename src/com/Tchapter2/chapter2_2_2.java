package com.Tchapter2;

import java.util.Scanner;

public class chapter2_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int N = input.nextInt();
        int M = input.nextInt();
        array = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = (int)(Math.random()*50);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if( i == j){
                    System.out.println("x[" + i + "][" + j + "] = " + array[i][j] + "    ");
                }
            }
        }
    }
}
