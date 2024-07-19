package garbagepackage;

public class FindHowManyDuplicatesInArray {
    public static void main(String[] args) {
        duplicateNumber();
    }




    public static void duplicateNumber(){
        int a[]={100, 200, 300, 400, 200, 600, 200};
        int num = 200;
        int count = 0;
        for (int x : a){
            if(x == num){
                count++;
            }

        }
        System.out.println(count);
    }
}
