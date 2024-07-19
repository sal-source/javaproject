package garbagepackage;

import java.io.*;

public class ReadDataFromTextFile {


    public static void readDataFromFile() throws IOException {
        FileReader fileReader = new FileReader("path of your file");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str =bufferedReader.readLine();

        while (str!=null){
            System.out.println(str);
        }

        bufferedReader.close();
    }
}
