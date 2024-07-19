package garbagepackage;

import java.util.Arrays;

public class SortingNumbers {
    public static void main(String[] args) {
        sortingNum();

    }




    public static void sortingNum(){
        int a[]={100, 200, 500 , 300, 400};
//        for (int x: a){
//            Arrays.sort(a);
//            System.out.println(x);
        Arrays.sort(a);
//
//        }
        System.out.println("the sorted Array :" + " \n" + Arrays.toString(a));
        System.out.println("min is " + a[0] + "\n" + "max is " + a[a.length-1]) ;
    }

}
