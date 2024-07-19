package firstpackage;

public class ReverseString {

    public static void main(String[] args) {
        // there are 3 methods to reverse String

        //Method 1 : String Concatenation
        String str1 = "TASSADIT";
        String rev = "";

//        int len =str1.length();
//        for (int i = len -1; i>=0;i--){
//            rev = rev + str1.charAt(i);
//        }
//        System.out.println(rev);
//
//        // Method 2: using Character Array
//
//        String name = "SALIM";
//        String reverse = "";
//        char a[]=name.toCharArray();
//        int length =a.length;
//         for (int i = length-1;i >=0; i--){
//             reverse = reverse + a[i];
//         }
//        System.out.println(reverse);

         // Using String Buffer
        StringBuffer stringBuffer = new StringBuffer(str1);
        stringBuffer.reverse();
        System.out.println(stringBuffer.reverse());
    }
}
