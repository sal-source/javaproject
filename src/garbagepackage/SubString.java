package garbagepackage;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR STRING :");
       String sub = scanner.nextLine();
        System.out.println(" the sub string is :");
         printSubstring(sub);




    }


    public static void printSubstring(String sub){

       String sb = sub.substring(1, 5);
        System.out.println(sb);


    }



}
