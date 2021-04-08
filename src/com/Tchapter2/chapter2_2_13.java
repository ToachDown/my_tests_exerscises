package com.Tchapter2;

import java.util.Scanner;

public class chapter2_2_13 {
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

        for(int j = 0; j < M;j++){  // возрастание
            for(int i = 0; i < N ; i++){
                for(int m = 0; m < N ;m++){
                    if(array[i][j] < array[m][j]){
                        temp = array[m][j];
                        array[m][j] = array[i][j];
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

        for(int j = 0; j < M;j++){  // убывание
            for(int i = 0; i < N ; i++){
                for(int m = 0; m < N ;m++){
                    if(array[i][j] > array[m][j]){
                        temp = array[m][j];
                        array[m][j] = array[i][j];
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
