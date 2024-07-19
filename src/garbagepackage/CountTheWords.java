package garbagepackage;

import java.util.Scanner;

public class CountTheWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
       String input = scanner.nextLine();
        countNumberOfWords(input);

    }

    public static void countNumberOfWords(String str){
        int count=1;

        for (int i =0; i<str.length()-1; i++){
            if (str.charAt(i)==' ' && (str.charAt(i+1)!=' ')){
                count++;


            }

        }System.out.println(count);
    }
}
