package com.Tchapter2;

import java.util.Scanner;

public class chapeter2_2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int N = input.nextInt();
        int M = input.nextInt();
        int temp;
        array = new int[N][M];
        int A;
        int B;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }

        for(int i = 0; i < N;i++){
            for(int j = 0; j < N;j++){
                System.out.println("x[" + i + "][" + j + "] = " + array[i][j] + "    ");
            }
        }

        System.out.println("write numbers:");
        A = input.nextInt();
        B = input.nextInt();

        for(int i = 0; i < N;i++){
            temp = array[i][A-1];
            array[i][A-1] = array[i][B-1];
            array[i][B-1] = temp;
        }

        for(int i = 0; i < N;i++){
            for(int j = 0; j < N;j++){
                System.out.println("x[" + i + "][" + j + "] = " + array[i][j] + "    ");
            }
        }


    }
}