package Controls;

public class Switchexp1 {
    public static void main(String[] args) {
       /* int month = 5;
        switch (month) {
        }*/

        final int fristday=1,lastday=7;
        int dayofWeek = 1;
        switch (dayofWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 1:{                                 //block allowed
                System.out.println("Sunday");
                break;}
            case 7:
                System.out.println("Saturday");
                break;
            case 1+1:
                System.out.println("MOdnay");
                break;
        }
        String firstname = "tarun";
        switch(firstname)
        {
            case "test" :
                System.out.println("test");
                break;
            //case java.time.dayofWeek:
            //  System.out.println("test2");
        }

        //next case
        final short size =4;
        final int small = 150000;
        final int big = 1_00_000;
        switch(small){
            case size :
                System.out.println("small");
                break;
            case big:
                System.out.println("big");

        }

    }
}

