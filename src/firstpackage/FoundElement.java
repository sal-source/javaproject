package firstpackage;

import java.util.Scanner;

public class FoundElement {



    public static void main(String[] args) {


        findElement();

    }




    public static  void findElement(){
        int a[]={100, 200, 300, 400, 500 };
        System.out.println(" enter a number");
        Scanner sc = new Scanner(System.in);
        int search_element =sc.nextInt();
    //
      // int   search_element = 600;
        boolean status = false;

        for(int x : a){
            if(x == search_element){
                System.out.println("element is found ");
                status =true;
                break;
            }


        }if(status == false){
            System.out.println("element not found");


        }


    }
}
