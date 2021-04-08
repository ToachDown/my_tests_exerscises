package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4_3 {
    public static void main(String[] args) {
        chapter2_4_3 core = new chapter2_4_3();
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();

        System.out.println(core.square(A)*6);
    }

    public double square(int A){
        double result;
        result = ((Math.sqrt(3))*A*A)/4;
        return result;
    }
}
