package garbagepackage;

import java.util.Scanner;

public class CountCharacterOccurence {

        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your String :");
             String str =scanner.nextLine();
            System.out.println(" the total  count of letter A is : ");
            countNumberOfReputationsOfLetterA(str);


        }




    public static void countNumberOfReputationsOfLetterA(String str){
       int totalCount= str.length();
       int countWithoutLetterA=str.replaceAll("a", "").length();
       int totalCountOfA= totalCount - countWithoutLetterA;
        System.out.println(totalCountOfA);

    }

}
