package firstpackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingElementInArray {
    public static void main(String[] args) {
//        int a[]={100, 600, 200, 400, 500};
//       // System.out.println(" before sorting ''''''");
//        for(int x:a){
//         //   System.out.println(x);
//
//
//            Arrays.sort(a);
//
//            System.out.println(x);
//
//        }


        int b[]= {10, 30, 40, 70, 60, 50, 20};
        System.out.println(" Array Element before Sorting :"+ Arrays.toString(b));
        Arrays.parallelSort(b);
        System.out.println(" Array Element After Sorting :" +Arrays.toString(b));



    }
}
