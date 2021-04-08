package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4_14 {
    public static void main(String[] args) {
        chapter2_4_14 core = new chapter2_4_14();
        Scanner input = new Scanner(System.in);
        int K = input.nextInt();

        core.searchArms(K);
    }

    public void searchArms(int k){
        for(int i = 1; i < k; i++){
            int sum = sumSearch(i);
            if(sum == i){
                System.out.println("number is " + i + " number Armstrong");
            }
        }
    }

    private int lenghtSearch(int k){
        int lenght = 0;
        for(int i = k; i!=0;){
            lenght++;
            i/=10;
        }
        return lenght;
    }

    private int sumSearch(int k){
        int sum = 0;
        for(int i = k; i!=0;){
            sum += Math.pow(i%10,lenghtSearch(k));
            i/=10;
        }
        return sum;
    }
}
