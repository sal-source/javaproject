package garbagepackage;

import java.util.Scanner;

public class CountNumCountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your String :");
         String  str = scanner.nextLine();
        System.out.println("The total count of the numbers are: ");
         countNum(str);
        System.out.println("The total count of the characters are: ");
         countSpecialCharacter(str);

    }

    public static void countNum(String str){

     //   String name = " 123#@!*&";
        int countNum =0;
        for (char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                countNum ++;
            }

        }
        System.out.println(countNum);


    }
    public static void countSpecialCharacter(String str){
        int countChar= 0;
        for( char ch1 : str.toCharArray()){
            if(!Character.isLetterOrDigit(ch1)){
                countChar++;
            }

        }
        System.out.println(countChar);

    }


}
