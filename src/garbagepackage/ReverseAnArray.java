package garbagepackage;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        reversedArray();
    }


    public static void reversedArray(){

        int a[]= { 100, 200, 300, 400, 500};
        for (int i= a.length-1; i>=0; i--){
            System.out.println(a[i]);
        }

    }

}
