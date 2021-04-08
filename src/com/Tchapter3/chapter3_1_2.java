package com.Tchapter3;

import java.util.Scanner;

public class chapter3_1_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        chapter3_1_2 core = new chapter3_1_2();
        String str = input.nextLine();
        core.replace(str);
    }

    public void replace(String str){
        str = str.replace("word" , "letter" );
        System.out.println(str);
    }
}
