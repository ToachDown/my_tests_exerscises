package com.Tchapter3;

import java.util.Scanner;

public class chapter3_2_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        chapter3_2_2 core = new chapter3_2_2();
        String str = input.nextLine();
        core.func(str);
    }

    public void func(String str){
        StringBuffer array = new StringBuffer(str);
        char[] arr = str.toCharArray();
        int j = 0;
        for(int i = 0;i < arr.length; i++){
            if(arr[i] == 'a'){
                array.insert(i+1+j, 'b');
                j++;
            }
        }
        System.out.println(array);
    }
}
