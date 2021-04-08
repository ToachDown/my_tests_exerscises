package com.Tchapter2;

import java.util.Scanner;

public class chapter2_2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int N = input.nextInt(); // ввожу количество строк
        int sum = 0; // сумма
        int numbmax = 0; // номер столбца с наибольше суммой
        int M = input.nextInt(); // ввожу количество столбцов
        array = new int[N][M];

        for (int i = 0; i < N; i++) {  // заполняю массив
            for (int j = 0; j < M; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }

        for(int j = 0; j < M; j++){   // цикл для нахождения суммы и номер столбца
            int summax = 0;
            for(int i = 0; i < N; i++){ //нахожу сумму каждого столбца
                summax += array[i][j];
            }
            System.out.println("sum = [" + j + "] = " + summax);
            if(sum < summax){ // сравниваю сумму предидущего столбца с нынешним
                sum = summax;
                numbmax = j;
            }
        }

        System.out.println("max sum is = " + sum + " [" + numbmax + "] stolbca");
    }
}
