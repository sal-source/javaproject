package firstpackage;

public class Reverse {
    public static void reverseString(String name){

        StringBuffer stringBuffer = new StringBuffer(name).reverse();

       String reverseName = stringBuffer.toString();
        System.out.println(reverseName);
    }

    public static void main(String[] args) {
        String name =" Juba";
        reverseString(name);

    }
}
