package com.Tchapter2;

import java.util.Arrays;
import java.util.Scanner;

public class chapter2_3_6 {
    public static void main(String[] args) {
        chapter2_3_6 core = new chapter2_3_6();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        double[] array = new double[N];

        for (int i = 0; i < N; i++) {
            array[i] = (Math.random() * 400) / 10;
        }
        System.out.println(Arrays.toString(array));

        core.sort(array);

        System.out.println(Arrays.toString(array));
    }

    public void sort(double[] array) {
        int h = 1;
        while (h*3 < array.length)
            h = h * 3 + 1;

        while(h >= 1) {
            hSort(array, h);
            h = h/3;
        }
    }

    private void hSort (double[] array, int h) {
        int length = array.length;
        double temp;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h]){
                    temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                }else
                    break;
            }
        }
    }
}
