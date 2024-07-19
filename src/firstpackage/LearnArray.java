package firstpackage;

public class LearnArray{
    public static void main (String[]args){

        //find size of an array
        int a []= {100,200,300,400,500};
        //System.out.println(a.length);

        // read  single value from an array
      //  System.out.println(a[4]);

        // read all values from an array
          //1.using normal loop
        for (int i =0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }
        System.out.println("--------------------------------------------------------------");

        //using for each loop
        for(int x:a){
            System.out.println(x);
        }


    }
}
