package firstpackage;

public class ForLoopPractice {
    //psvm
    public static void main(String[] args) {

        //sout for the println
        // debugger shows how the java read, run and execute  the program
        System.out.println(" ...............Debugger....................");
        System.out.println("i love java1");
        System.out.println("i love python2");
        System.out.println("i love java3");
        System.out.println("i love python 4");
        System.out.println(" i love java 5");
        System.out.println("i love python 6");
        //for loop

        System.out.println(" ........for loop............. ");
        //java print me i love java 10 times
        //start counting from o
        //keep counting till 9
        // increment the number every time i++ ;decrement i--
        // for loop helps to print i love java multiple times without repeating the println
        for (int i = 0; i < 10; i++) {
            System.out.println("i love java" + i);

        }
        for (int i = 0; i < 10; i += 2) {

            System.out.println(" i love ramadan" + i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(" hello world" + i);
        }

        // print  i love java 10 times
        // for each times of java,print i love  selenium 2 times
        for (int j = 0; j < 10; j++) {
            System.out.println("i love java " + j);
            System.out.println("i love selenium" + j);
            System.out.println("i love python" + j);

        }


        // inner for loop it is  loop inside another loop
        // variables should have  different name most used are i,j,x,y
        for (int i = 0; i < 10; i++) {
            System.out.println("i love java" + i);
            for (int j = 0; j < 2; j++) {
                System.out.println("i love selenium" + j);
            }

        }
        // conditional for loop
        // count till 10, if the number is 5, print java, if the number is 6 print selenium
        // for the rest print python.

        for(int i=0; i<10;i++){
            if(i==5) {
                System.out.println("java");
            } else if( i==6){
                System.out.println("selenium");
            }else {
                System.out.println("python");
            }

        }


    }


}
