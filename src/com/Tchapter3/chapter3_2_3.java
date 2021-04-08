package com.Tchapter3;

import java.util.Scanner;

public class chapter3_2_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        chapter3_2_3 core = new chapter3_2_3();
        String str = input.nextLine();
        core.proverka(str);
    }

    public void proverka(String str){
        StringBuffer arr = new StringBuffer(str);
        StringBuffer arr2 = new StringBuffer(str).reverse();
        if((arr2.toString()).equals(arr.toString())){
            System.out.println("this string is polindrom");
        } else {
            System.out.println("this string is another");
        }
    }
}
