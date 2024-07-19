package firstpackage;

public class TwoDimensionalArray {

    public static void main (String []args){

        // declare 2 dimensional array
        int a [][]= { {100,200},{300, 400}, {500,600} };

        // find size of an Array
      //  System.out.println("length of rows" + i.length);
        //   System.out.println("length of columns " + i[0].length);

        // Read single value from an Array
         // System.out.println(i[2][1]);

        // read all value from an array

         // normal for loop
         for(int r=0; r<=2; r++){
             for (int c=0; c<=1;c++){
                 System.out.print(a[r][c] + " ");
             }
             System.out.println();
         }

            




    }

}
