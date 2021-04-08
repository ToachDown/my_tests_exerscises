package com.Tchapter2;

import java.util.Scanner;

public class chapter2_2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int temp;
        int N = input.nextInt();
        int M = input.nextInt();
        array = new int[N][M];

        for (int i = 0; i < N; i++) {  // заполняю массив
            for (int j = 0; j < M; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }

        for(int i = 0; i < N;i++){
            for(int j = 0; j < M;j++){
                System.out.print("x[" + i + "][" + j + "] = " + array[i][j] + "    ");
            }
            System.out.println();
        }

        System.out.println("_______");

        for(int i = 0; i < N ; i++){  // возрастание
            for(int j = 0; j < M;j++){
                for(int m = 0; m < M ;m++){
                    if(array[i][j] < array[i][m]){
                        temp = array[i][m];
                        array[i][m] = array[i][j];
                        array[i][j] = temp;
                    }
                }
            }
        }

        for(int i = 0; i < N;i++){
            for(int j = 0; j < M;j++){
                System.out.print("x[" + i + "][" + j + "] = " + array[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println("_______");

        for(int i = 0; i < N ; i++){ // убывание
            for(int j = 0; j < M;j++){
                for(int m = 0; m < M ;m++){
                    if(array[i][j] > array[i][m]){
                        temp = array[i][m];
                        array[i][m] = array[i][j];
                        array[i][j] = temp;
                    }
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
