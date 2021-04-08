package com.Tchapter2;

import java.util.Scanner;

public class chapter2_2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int N = input.nextInt();
        array = new int[N][N];

        for (int i = 0; i < N; i+=2) {
            for (int j = 0; j < N; j++) {
                array[i][j] = j+1;
                array[i+1][j] = N-j;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                    System.out.println("x[" + i + "][" + j + "] = " + array[i][j] + "    ");
            }
        }
    }
}
