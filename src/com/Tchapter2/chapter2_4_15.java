package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4_15 {
    public static void main(String[] args) {
        chapter2_4_15 core = new chapter2_4_15();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] array;

        array = core.initialization(N);
        core.search(array);
    }

    public void search(int[] array){
        int f;
        for(int i = 0; i < array.length;i++){
            int number;
            f=0;
            for(int j = array[i] ;j != 0;){
                number = array[i]%10;
                j/=10;
                if(j%10 >= number){
                    f = 1;
                    break;
                }
            }
            if(f == 0){
                System.out.println(array[i]);
            }
        }
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
