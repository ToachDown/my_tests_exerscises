package com.Tchapter2;

import java.util.Scanner;

public class chapter2_2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int k;
        int p;
        int N = input.nextInt();
        int M = input.nextInt();
        array = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }

        System.out.println("write k stolbec");
        k = input.nextInt()-1;
        System.out.println("write p stroku");
        p = input.nextInt()-1;

        for(int j = 0; j < M; j++){
            System.out.println("x[" + k + "][" + j + "] = " + array[k][j] + "    ");
        }

        for(int i = 0; i < N; i++){
            System.out.println("x[" + i + "][" + p + "] = " + array[i][p] + "    ");
        }

    }
}
