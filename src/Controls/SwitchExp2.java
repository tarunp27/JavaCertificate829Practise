package Controls;

public class SwitchExp2 {
    static {
        var ii= 20;
    }

    public static void main(String[] args) {
        int day = 7;
        var result = switch (day) {
            case 1 -> "Weekend Sunday";
            case 2 -> "Monday work";
            case 3,4,5, 6 -> "TUE/WED/THUR/FRI work";
            case 7 -> "Weekend Saturday";
            default -> {
                System.out.println("Error we received wrong day");
                yield "Not a week number";
            }
        };

        System.out.println("result "+result);

        switch (day) {
            case 1,7 ->{
                System.out.println("Weekends");break;}
            case 2,3,4,5,6->
                System.out.println("Week days");
        }


    }
}
