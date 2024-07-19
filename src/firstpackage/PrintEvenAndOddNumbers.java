package firstpackage;

public class PrintEvenAndOddNumbers {

    public static void main(String[] args) {
//        int []a= {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10 };
//        printEvenAndOddNumber(a);
//    }
//
//    public static void printEvenAndOddNumber(int a[]){
//
//        for (int x: a){
//            if(x%2==0){
//                System.out.println("Even number" + " "+ x);
//            }else {
//                System.out.println("odd number"+ " " + x);
//            }
//        }

    evenNumber(1);
    oddNumber(1);

    }


    public static void evenNumber(int i){
        for (i =0; i<=10; i++){
            if (i % 2==0){
                System.out.println(i);
            }

        }
    }

    public static void oddNumber(int i){
        while (i<=10){
            if (i % 2!=0){
                System.out.println(i);
            }
            i++;
        }
    }


}
