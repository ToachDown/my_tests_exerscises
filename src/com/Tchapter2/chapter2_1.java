package com.Tchapter2;

import java.util.Scanner;

public class chapter2_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = new int[Integer.parseInt(args[0])];
        int sum = 0;
        int k = input.nextInt();

        for(int i = 0; i< array.length;i++){
            System.out.println("array[" + i + "] = ");
            array[i] = input.nextInt();
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] % k == 0){
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
