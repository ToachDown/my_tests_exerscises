package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4_7 {
    public static void main(String[] args) {
        chapter2_4_7 core = new chapter2_4_7();
        core.request();
    }

    public void request(){
        int sum = 0;
        for(int i = 1; i <=9;i+=2){
            sum += factorial(i);
        }
        System.out.println(sum);
    }

    private int factorial(int N){
        int result = 1;
        for(int i = 1;i <= N;i++){
            result*=i;
        }
        return result;
    }
}
