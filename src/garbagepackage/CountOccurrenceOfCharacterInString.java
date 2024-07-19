package garbagepackage;

public class CountOccurrenceOfCharacterInString {
    public static void main(String[] args) {
        String str = "saaaliiiim ihadddddadene";
        countOccurrence(str);

    }

    public static void countOccurrence(String str ){

       int originalString = str.length();
      String str1= str.replaceAll("a","");
      int updatedString =str1.length();
     int count = originalString -updatedString;
        System.out.println("the total time a is repeated is : "+ count);

    }
}
