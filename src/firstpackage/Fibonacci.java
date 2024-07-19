package firstpackage;

public class Fibonacci {
    public static void main(String[] args) {

        int first =0;
        int second = 1;
        int length = 8;
        System.out.println(first + " \n" + second) ;

        for(int i = 2; i<length; i++){
             int next = first + second ;

            System.out.println(next);
            first = second;
            second = next;
        }

    }
}
