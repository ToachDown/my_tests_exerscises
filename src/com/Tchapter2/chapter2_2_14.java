package com.Tchapter2;

public class chapter2_2_14 {
    public static void main(String[] args) {
        int[][] array;
        int count;
        int N = (int) (Math.random() * 10);
        int M = (int) (Math.random() * 10);
        array = new int[N][M];

        for (int j = 0; j < M; j++) {  // заполняю массив
            count = 0;
            for (int i = 0; i < N; i++) {
                if((j+1) > count){
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
                count++;
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
