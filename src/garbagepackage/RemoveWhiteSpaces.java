package garbagepackage;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string :");
       String str1= scanner.nextLine();
       replaceSpace(str1);

    }


    public static void replaceSpace(String str){
       String str1= str.replaceAll("\\s", "");
        System.out.println(str1);


    }




}
