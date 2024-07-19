package garbagepackage;

import java.util.Scanner;

public class ReplaceJunkInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String :");
         String str1 =scanner.nextLine();
        System.out.println(" The plain string is :");
         replaceJunk(str1);


    }

    public static void replaceJunk(String str){

       str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);

    }
}
