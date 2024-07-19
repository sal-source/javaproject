package secondpackag;

import java.util.Arrays;

public class MaxNumInArray {
    public static void main(String[] args) {
        getMaxNun();
        getMinNum();

    }


    public static void getMaxNun(){
       int a[]={1,423,6,46,13,53,4};
             int max=a[0];
             for(int i= 1;i<=a.length-1;i++){
                 if(a[i]>max){
                     max=a[i];

                 }
             }
        System.out.println(max + " is the maximum number  ");
    }

    public static void getMinNum(){
        int a[]={1,423,6,46,13,53,4};
//        int min =a[0];
//        for (int element : a){
//            if(element < min){
//                min=element;
//
//            }
//
//        }System.out.println(min + "  is the minimum number ");
//

        //using sorting methode
        Arrays.sort(a);
        System.out.println("min =" + a[0]  + " max =" + a[a.length-1]);


    }
}
