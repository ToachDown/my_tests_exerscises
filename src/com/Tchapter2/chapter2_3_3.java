package com.Tchapter2;

import java.util.Scanner;

public class chapter2_3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] array = new int[N];

        for(int i = 0; i < N; i++){
            array[i] = 4*i+i*i;
            System.out.println("x[" + i + "] = " + array[i]);
        }
        System.out.println("----------------");
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int max = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    pos = j;    // pos - индекс наименьшего элемента
                    max = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = max;    // меняем местами наименьший с array[i]
        }

        for(int i = 0; i < N ; i++){
            System.out.println("x[" + i + "] = " + array[i]);
        }
    }
}
