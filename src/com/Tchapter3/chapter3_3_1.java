package com.Tchapter3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class chapter3_3_1 {
    public static void main(String[] args){
        chapter3_3_1 core = new chapter3_3_1();
        core.go();
        List<String> list= new Stack<>();
    }

    public void go(){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int choise = 0;
        while(choise != -1){
            System.out.println("1:sort for number predlojeni");
            System.out.println("2:sort for lenght words in predlojeni");
            System.out.println("3:sort for number repite simvol in words or alphavite");
            System.out.println("-1:exit");
            choise = input.nextInt();
            if(choise == 1){
                str = sortAbzac(str);
            } else if(choise == 2){
                str = sortPredl(str);
            } else if(choise == 3){
                str = sortSlov(str,input);
            } else{
                System.out.println("error rewrite the number");
            }
        }
    }

    private String[] parsePredloj(String str){
        String[] result = str.split("\\.|\\?|\\!");
        return result;
    }

    private String[] parseParagraph(String str){
        String[] paragraphs= str.split("   ");
        System.out.println(Arrays.toString(paragraphs));
        return paragraphs;
    }

    private String sortAbzac(String str){
        String[] paragraph = parseParagraph(str);
        str  = "";
        String temp;
        for(int i = 0; i < paragraph.length; i++) {
            for (int j = 0; j < paragraph.length-1; j++) {
                if (parsePredloj(paragraph[i]).length <= parsePredloj(paragraph[j + 1]).length) {
                    temp = paragraph[i];
                    paragraph[i] = paragraph[j + 1];
                    paragraph[j + 1] = temp;
                }
            }
        }
        for(String item: paragraph){
            str = str.concat(item + " ");
        }
        System.out.println(str);
        return str;
    }

    private String sortPredl(String str){
        String[] predloj = parsePredloj(str);
        str = "";
        String temp;
        for(int i = 0; i < predloj.length;i++){
            String[] word = predloj[i].split(" ");
            predloj[i] = "";
            for(int j = 0; j < word.length; j++){
                for(int m = 0; m < word.length-1;m++) {
                    if (word[j].length() <= word[m + 1].length()) {
                        temp = word[j];
                        word[j] = word[m + 1];
                        word[m + 1] = temp;
                    }
                }
            }
            for(String item : word){
                predloj[i] = predloj[i].concat(item + " ");
            }
        }
        for(String item : predloj){
            str = str.concat(item + ". ");
        }
        System.out.println(str);
        return str;
    }

    private String sortSlov(String str,Scanner input){
        String k = input.nextLine();
        String[] predloj = parsePredloj(str);
        String temp;
        for(int i = 0; i < predloj.length;i++) {
            String[] word = predloj[i].split(" ");
            int max = 0;
            for(int j = 0; j < word.length; j++){
                char[] array = word[i].toCharArray();
                int count = 0;
                for(int m = 0; m < array.length;m++){
                    if(Character.toString(array[m]).equals(k)){
                        count++;
                    }
                }
                if(max < count){
                    temp = word[i];
                    word[i] = word[i+1];
                    word[i+1] = temp;
                }
            }
        }
        return str;
    }
}
