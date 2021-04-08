package com.Tchapter2;

import java.util.Scanner;

public class chapter2_2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int max;
        int N = input.nextInt();
        int M = input.nextInt();
        array = new int[N][M];

        for (int i = 0; i < N; i++) {  // заполняю массив
            for (int j = 0; j < M; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }

        max = array[0][0];
        for (int i = 0; i < N; i++) {  // заполняю массив
            for (int j = 0; j < M; j++) {
                if(max < array[i][j]){
                    max = array[i][j];
                }
            }
        }

        for (int i = 0; i < N; i++) {  // заполняю массив
            for (int j = 0; j < M; j++) {
                if(array[i][j] % 2 == 1){
                    array[i][j] = max;
                }
            }
        }

        for(int i = 0; i < N;i++){
            for(int j = 0; j < M;j++){
                System.out.print("x[" + i + "][" + j + "] = " + array[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
