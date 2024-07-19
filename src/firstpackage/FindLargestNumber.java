package firstpackage;

public class FindLargestNumber {
    static int a= 10, b= 20, c = 30;
//   static int a = 80;
//   static int b = 50;
//   static int c = 30;

    public static void main(String[] args) {
        if(a>b && a>c){
            System.out.println("a is the largest number"+ a);
        } else if (b>a && b>c) {
            System.out.println("b is the largest number "+ b);

        }else {
            System.out.println("c is the largest number" + " "+ c);
        }
    }
}
