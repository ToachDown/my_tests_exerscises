package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4_16 {
    public static void main(String[] args) {
        chapter2_4_16 core = new chapter2_4_16();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] array;

        array = core.initialization(N);
        core.sum(array);
    }

    public void sum(int[] array){
        int f;
        int count = 0;
        int sum = 0;
        for(int i = 0; i < array.length;i++){
            f=0;
            for(int j = array[i] ;j != 0;){
                if((j%10)%2 != 1){
                    f = 1;
                    break;
                } else {
                    j/=10;
                }
            }
            if(f == 0){
                sum += array[i];
            }
        }
        for(int i = sum; i != 0;){
            if((i%10)%2 == 0 && i%10 != 0){
                count++;
            }
            i/=10;
        }
        System.out.println("sum is " + sum + " number chetnih is " + count);
    }

    public int[] initialization(int N){
        int M = (int) ((Math.pow(10,N)) - Math.pow(10,N-1));
        int[] result = new int[M];
        int j = 0;
        for(int i = (int) Math.pow(10,N-1); i < (int)(Math.pow(10,N));i++ ){
            if(j < M){
                result[j] = i;
                j++;
            } else{
                break;
            }
        }
        return result;
    }
}
