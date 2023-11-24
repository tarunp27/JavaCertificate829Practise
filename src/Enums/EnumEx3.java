package Enums;

import Interface.Bear;

enum Beers{
    KF,KO,RC,FO;
    public static void main(String[] args) {
        Beers[] b = Beers.values();
        for(Beers b1 : b){
            System.out.println(b1);
            System.out.print(b1.ordinal());
//            System.out.print(b1.name());
//            System.out.println();
        }
        var sales = 4;
        switch (sales) {
            default:
                System.out.println("Default value");
            case 1,5:
                System.out.println("Case1");
                break;
            case 2:
                System.out.println("Case 5");
                break;
        }
        int day = 6;
        int val=0;
        String result = switch (day) {
            case 1,7 ->
                    "Weekend";
            case 2 ->"Monday";
            case 3-> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "Not a valid value";
        };

        System.out.println(result);

    }
}

public class EnumEx3 {
}
