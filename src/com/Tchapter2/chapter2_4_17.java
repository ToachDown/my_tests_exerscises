package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4_17 {
    public static void main(String[] args) {
        chapter2_4_17 core = new chapter2_4_17();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        core.search(N);
    }

    public void search(int N){
        int i = 0;
        for(; N != 0; i++){
            N-=minus(N);
        }
        System.out.println(i);
    }

    private int minus(int N){
        int sum = 0;
        for(int i = N; i != 0; i/=10){
            sum+= i%10;
        }
        return sum;
    }
}
