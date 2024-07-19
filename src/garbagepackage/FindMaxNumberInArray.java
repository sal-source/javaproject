package garbagepackage;

public class FindMaxNumberInArray {

    public static void main(String[] args) {


        //find the largest number in array
        int a[] = {100, 200, 400, 600, 500};
       int max = a[0];

        for (int i = 1; i <= a.length-1;i++){
            if(a[i]>max){
                max=a[i];
            }


        }

        System.out.println("The maximum number is :" + max);


        //find the minimum number in array
        int b[]={30, 40, 50, 20, 60, 10};
        int minimum = b[0];
        for (int i =1; i<b.length; i++){
            if(b[i]<minimum){
                minimum=b[i];
            }

    }
        System.out.println("The Minimum Number is :" + minimum);
    }





}
