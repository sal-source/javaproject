package thirdpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFile {
    public static void main(String[] args) {
        String tempContainer;
        String finalContainer = "";// in order to read file in java we nee class call FileReader when we typing it we need
                                 // to chose the one it says FileReader.java.io

        try {
            FileReader fileReader =  new FileReader("src/thirdpackage/data.txt");//inside the FileReader() constractor we need to give path
            BufferedReader bufferedReader = new BufferedReader(fileReader);// located on file in our example in data.txt with right click on it we need to copy path
                                                                          // path located in path from content root
            while((tempContainer = bufferedReader.readLine())!=null){
                finalContainer = finalContainer+tempContainer;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(finalContainer);



    }
}
