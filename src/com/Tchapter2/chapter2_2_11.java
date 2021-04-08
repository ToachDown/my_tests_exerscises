package com.Tchapter2;

public class chapter2_2_11 {
    public static void main(String[] args) {
        int[][] array;
        int N = 10;
        int M = 20;
        array = new int[N][M];

        for (int i = 0; i < N; i++) {  // заполняю массив
            for (int j = 0; j < M; j++) {
                array[i][j] = (int) (Math.random() * 15);
            }
        }

        for(int i = 0; i < N;i++){
            for(int j = 0; j < M;j++){
                System.out.println("x[" + i + "][" + j + "] = " + array[i][j] + "    ");
            }
        }

        for(int i = 0; i < N;i++) {
            int count = 0;
            for (int j = 0; j < M; j++) {
                if(array[i][j] == 5){
                    count++;
                }
            }
            if(count >= 3){
                System.out.println("number stroki is " + i);
            }
        }
    }
}
