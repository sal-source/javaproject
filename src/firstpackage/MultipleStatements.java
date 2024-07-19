package firstpackage;

public class MultipleStatements {
    public static void main(String[] args) {
        if(false){
            if(false){
                System.out.println("abc");
            }else{
                System.out.println("xyz");
            }
        }else {
            System.out.println("123");
        }
    }
}
