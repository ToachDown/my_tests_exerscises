package com.Tchapter3;

import java.util.Scanner;

public class chapter3_2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        chapter3_2_8 core = new chapter3_2_8();
        String str = input.nextLine();
        core.func(str);
    }

    public void func(String str){
        String[] pres = str.split(" ");
        int result = pres[0].toCharArray().length;
        for(int i = 1; i < pres.length; i++){
            if(result < pres[i].toCharArray().length){
                result = pres[i].toCharArray().length;
            }
        }
        System.out.println(result);
    }
}
