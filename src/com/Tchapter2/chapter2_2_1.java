package com.Tchapter2;

import java.util.Scanner;

public class chapter2_2_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] array;
        int N = input.nextInt();
        int M = input.nextInt();
        array = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                array[i][j] = input.nextInt();
            }
        }

        for(int j = 0; j < M; j+=2) {
            if(array[0][j] > array[N-1][j]){
                for (int i = 0; i < N; i++) {
                    System.out.print("x[" + i + "][" + j + "] = " + array[i][j] + "    ");
                }
            }
            System.out.println("  ");
        }
    }
}
