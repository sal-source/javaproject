package secondpackag;

public class Mobile {
    public Mobile(){
        System.out.println("Mobile Constructor is being executed");
    }
    public void printMakeOfMobile(String makeOfMobile){
        System.out.println(makeOfMobile+ " from printMakeOfMobile methode");
    }
    public void printMakeOfMobile(int yearOfMobile) {
        System.out.println(yearOfMobile + " from printMakeOfMobile methode");
    }
    public void printMakeOfMobile(String makeOfMobile, int yearOfMobile) {
        System.out.println(makeOfMobile + " from printMakeOfMobile methode");
    }

}
