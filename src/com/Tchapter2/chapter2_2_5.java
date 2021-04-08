package com.Tchapter2;

import java.util.Scanner;

public class chapter2_2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int N = input.nextInt();
        array = new int[N][N];

        for (int i = 0; i < N; i ++) {
            for (int j = 0; j < N; j++) {
                if (i + j <= N - 1 ) {
                    array[i][j] = i+1;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("x[" + i + "][" + j + "] = " + array[i][j] + "    ");
            }
        }
    }
}
