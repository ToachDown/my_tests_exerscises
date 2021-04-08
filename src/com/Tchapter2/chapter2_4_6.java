package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4_6 {
    public static void main(String[] args) {
        chapter2_4_6 core = new chapter2_4_6();
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        core.search(A,B,C);

    }

    public void search(int A,int B,int C){
        int result;
        int preRes = HOD(A,B);
        result = HOD(preRes,C);
        if(Math.abs(result) == 1){
            System.out.println("this numbers is mutually simple");
        } else {
            System.out.println("this numbers is not mutually simple");
        }
    }

    private int HOD(int A, int B){
        while(A != 0 && B != 0){
            if(A > B){
                A = A % B;
            } else{
                B = B % A;
            }
        }
        return A+B;
    }
}
