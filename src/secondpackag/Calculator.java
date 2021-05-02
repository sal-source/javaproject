package secondpackag;

public class Calculator {
    // constructor--> has the same name of the class name
    public Calculator(){

    }


    // main methode
    public static void main(String[] args) {
        doAddition();
        getDataFromMath();
        // object creation we need
        // classThatYouWantToCreateObjectOf space objectName/referenceVariable = new nameOfTheConstructor()

        Calculator objectOfCalculator = new Calculator();
        objectOfCalculator.doAddition2();
        objectOfCalculator.getDataFromMath2();



    }

    // static void method
    public static void doAddition() {

        int a = 10;
        int b = 20;
        //System.out.println(a+b);
        int c = a + b;
        System.out.println(c + "from doAddition");
    }

    // static return type
    public static int getDataFromMath() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c + "from getDataFromMath");
        return c;
    }

    // non static void --> in order to run non static methode
    // we need to create object of the class

    public void doAddition2() {
        int a = 10;
        int b = 20;
        //System.out.println(a+b);
        int c = a + b;
        System.out.println(c + "from doAddition");

    }

    // non static return type
    public int getDataFromMath2() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c + "from getDataFromMath");
        return c;
    }


}



