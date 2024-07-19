package firstpackage;

public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Is Even number ");
            } else {
                System.out.println(i + " Is odd number");
            }
        }

        // print 1 to 10 descending order
        for(int a =10; a>=1; a--){
            System.out.println(a);
        }
    }
}
