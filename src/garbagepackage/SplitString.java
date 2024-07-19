package garbagepackage;

import java.util.Arrays;

public class SplitString {

    public static void main(String[] args) {
//        String sp = "abc@gamil.com";
//        String []a =sp.split("@");
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(Arrays.toString(a));

        String name = "   YEMA";
        String rev ="";



        for (int i = name.length()-1; i>=0; i--){
         rev = rev + name.charAt(i);

        } System.out.println(rev);

       StringBuffer stringBuffer = new StringBuffer(name);
        StringBuffer sb =stringBuffer.reverse();
        System.out.println(sb);






    }


}
