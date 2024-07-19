package firstpackage;

public class PrintWeekName {
    public static void main(String[] args) {
        int weekNum = 10;
//        if(weekNum ==1){
//            System.out.println("Sunday");
//
//        }else if(weekNum==2){
//            System.out.println("Monday");
//
//        } else if (weekNum==3) {
//            System.out.println("Tuesday");
//        } else if (weekNum==4) {
//            System.out.println("Wednesday");
//
//        }else if (weekNum==5) {
//            System.out.println("Thursday");
//
//        }else if (weekNum==6) {
//            System.out.println("Friday");
//        }else if (weekNum==7) {
//            System.out.println("Saturday");
//        }else {
//            System.out.println("invalid day number");
//        }
//        switch (weekNum){
//            case 1: System.out.println("Sunday"); break;
//            case 2: System.out.println("Monday"); break;
//            case 3: System.out.println("Tuesday"); break;
//            case 4: System.out.println("Wednesday"); break;
//            case 5: System.out.println("Thursday"); break;
//            case 6: System.out.println("Friday"); break;
//            case 7: System.out.println("Saturday");break;
//            default: System.out.println("invalid weekNum");
//
//
//
//        }
        String weekName = "Monday";

        switch (weekName){
            case "Sunday": System.out.println(1);break;
            case "Monday": System.out.println(2);break;
            case "Tuesday": System.out.println(3);break;
            case "Wednesday": System.out.println(4);break;
            case "THursday": System.out.println(5);break;
            case "Friday": System.out.println(6);break;
            case "Saturday": System.out.println(7);break;
            default:
                System.out.println("invalid week name");
        }



    }

}
