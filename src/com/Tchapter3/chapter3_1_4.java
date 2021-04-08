package com.Tchapter3;

import java.util.Scanner;

public class chapter3_1_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        chapter3_1_4 core = new chapter3_1_4();
        String str = input.nextLine();
        core.count(str);
    }

    public void count(String str){
        char[] array = str.toCharArray();
        int count = 0;
        for(int i = 0; i < array.length-1 ; i++){
            if(Character.isDigit(array[i]) == true && Character.isDigit(array[i+1]) == false){
                count++;
            }
        }
        System.out.println("number of digit is " + count);
    }
}
