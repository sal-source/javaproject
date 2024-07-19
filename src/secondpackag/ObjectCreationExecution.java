package secondpackag;

public class ObjectCreationExecution {
    public static void main(String[] args) {


        Laptop laptop = new Laptop();
        laptop.printModelOfLaptop();

        int year = laptop.getYearOfLaptop();
        System.out.println(year);

        laptop.printModelOfLaptop();
        Laptop laptop2 = new Laptop(2025);
        laptop2.printDetailOfLaptop();

        Laptop laptop3 =new Laptop(2025, "Asus");
        laptop3.printDetailOfLaptop();


    }


}
