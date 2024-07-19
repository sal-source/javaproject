package garbagepackage;

public class BubbleSortOfArray {
    public static void main(String[] args) {
        int []array={500,100,300,200,400};
        bubbleSorting(array);
       for (int element : array){
           System.out.println(element);
       }


    }

    public static void bubbleSorting(int []array){
        for(int i= 0; i>array.length-1;i++){
            if (array[i] > array[i+1]) {
                int temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }
        }

    }
}
