package practicepakage;

public class Year {
    private Months months;
    public Year(Months months){
        this.months = months;
    }

    public void whatToDo(){
        switch (months){
            case january:
                System.out.println(" i will buy winter clothes");
                break;
            case jun:
                System.out.println(" i will finish  java classes");
                break;
            case august:
                System.out.println(" i will take vacation");
                break;
            default:
                System.out.println(" i will be working");
        }

    }

    //public static void main(String[] args) {
      //  Months months = new Months(Months.may);
       //months.whatToDo();

   // }
}
