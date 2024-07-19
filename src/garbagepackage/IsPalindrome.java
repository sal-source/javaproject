package garbagepackage;

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter The String : ");
        String input = sc.nextLine();
        palindrome(input);


    }

    public static void palindrome(String str) {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }

        if (str.equals(rev)) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }

//    }
//public static void main(String[] args) {
//    Scanner scanner= new Scanner(System.in);
//    System.out.println("enter your string: ");
//    String input = scanner.nextLine();
//    palindrome(input);
//}
//    public static void palindrome (String str){
//        String reverse=" ";
//
//        for(int i = str.length()-1;i>=0;i--){
//            reverse= reverse + str.charAt(i);
//
//        }
//        if(str.equals(reverse)){
//            System.out.println(str + "IsPalindrome");
//        }else{
//            System.out.println(str + "IsNotPalindrome");
//        }
//
//    }
//}
    }
}