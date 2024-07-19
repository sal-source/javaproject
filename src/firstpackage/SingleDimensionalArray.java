package firstpackage;

public class SingleDimensionalArray {
   public static void main(String[] args){

       // declare an array 1st method
       int a []= new int[5];
       a[0]= 100;
       a[1]= 200;
       a[2]= 300;
       a[3]= 400;
       a[4]= 500;

       // 2nd method
       int b[] = {100, 200, 300, 400, 500};

       //find length of an array
       System.out.println(" length of an array is :" + a.length);

       // read element from an Array
       System.out.println(b[3]);


       // Read all value from an Array
       for(int i= 0; i<a.length;i++){
           System.out.println(a[i]);
       }
       System.out.println("------------using for each loop ------------------------------");
       for(int x:b){
           System.out.println(x);
       }



   }


}
