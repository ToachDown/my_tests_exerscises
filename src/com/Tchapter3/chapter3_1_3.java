package com.Tchapter3;

import java.util.Scanner;

public class chapter3_1_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        chapter3_1_3 core = new chapter3_1_3();
        String str = input.nextLine();
        core.counter(str);
    }
    public void counter(String str){
        char[] array = str.toCharArray();
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(Character.isDigit(array[i])){
                count++;
            }
        }
        System.out.println("number of digit is " + count);
    }
}
