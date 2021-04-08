package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4_8 {
    public static void main(String[] args) {
        chapter2_4_8 core = new chapter2_4_8();
        Scanner inPut = new Scanner(System.in);
        int N = inPut.nextInt();
        int[] D = new int[N];
        core.input(D,N);
        core.sum(D,N);
    }

    public void sum(int[] D,int N){
        int sum = 0;
        for(int i = 0; i < N-2;i+=3){
            sum = D[i] + D[i+1] + D[i+2];
            System.out.println(sum);
        }
    }

    public void input(int[] array,int N){
        for (int i = 0; i < N; i++){
            array[i] = (int)(Math.random()*30);
        }
    }
}
