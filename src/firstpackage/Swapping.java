package firstpackage;

public class Swapping {
    public static void main(String[] args) {
        swappingNumber(3, 6);
    }
    

    public static void swappingNumber(int x, int y ){

       int temp = x;
        x = y;
        y = temp;

        System.out.println("the swapped numbers : " + x + " " + y);




    }
}
