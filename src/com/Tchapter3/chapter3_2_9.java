package com.Tchapter3;

import java.util.Scanner;

public class chapter3_2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        chapter3_2_9 core = new chapter3_2_9();
        String str = input.nextLine();
        core.counter(str);
    }

    public void counter(String str){
        char[] array = str.toCharArray();
        int lowerCase = 0;
        int upperCase = 0;
        for(int i = 0; i < array.length; i++){
            if(Character.isUpperCase(array[i])){
                upperCase++;
            }
            if(Character.isLowerCase(array[i])){
                lowerCase++;
            }
        }
        System.out.println(" lower = " + lowerCase + " upper = " + upperCase);
    }
}
