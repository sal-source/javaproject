package secondpackag;

public class Laptop {

    // defaultConstructor
    // access specifier sameNameOfTheClss(){---constructor starts
    //constructor body
    //constructor ends
    // difference btw constructor and methode
    // constructor: has the same name of the class.
    // constructor doesn't have any return  or void type
    // methode : methode name can be anything. has return or void type
    // there is 2 type of variables : local variable and global variable

    // 1-Default constructor--> public Laptop(){}
    public Laptop() {
    }

    // 2-Parameterized constructor

    public Laptop(int yearFromConstructor) {
        System.out.println("our new constructor is being executed ");
        this.year = yearFromConstructor;
    }
    public Laptop(int yearFromConstructor, String modelFromConstructor) {
        this.year = yearFromConstructor;
        this.model = modelFromConstructor;
    }
        //global variable/ or class level variable
        int year = 2021;
        String model;

        public void printModelOfLaptop () {
            //local variable/ method level variable--> they belong to this methode only
            // local variable cant go btw method

            System.out.println(model);

        }

        public int getYearOfLaptop () {
            System.out.println();
            return year;
        }
        public void printDetailOfLaptop(){
            System.out.println("laptop year is " + year);
            System.out.println(" laptop model is " + model );
        }
    }

