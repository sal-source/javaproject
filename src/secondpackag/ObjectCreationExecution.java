package secondpackag;

public class ObjectCreationExecution {
    public static void main(String[] args) {


        Laptop laptop = new Laptop();
        laptop.printModelOfLaptop();

         int year = laptop.getYearOfLaptop();
        System.out.println(year);

    }


}
