package garbagepackage;

public class PracticeClass {


    public static void main(String[] args) {
        String str = "mom";
        String rev = "";
        for(int i =str.length()-1; i>=0; i--){
           rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        //using string buffer

//        StringBuffer stringBuffer = new StringBuffer(str);
//
//        System.out.println(stringBuffer.reverse());


        if(str.equals(rev)){
            System.out.println(str + " is palindrome");

        }else {
            System.out.println(str  + " is not palindrome");
        }

        // remove junk or special character

        String name = "S1A!#@Li%^m8";
         String name2= name.replaceAll("[0-9!#@%^]","");
        System.out.println(name2);



        // remove white space

        String str1 = "Salim lov e ja   va";
        String str3 =str1.replaceAll("\\s", "");
        System.out.println(str3);






    }
}

