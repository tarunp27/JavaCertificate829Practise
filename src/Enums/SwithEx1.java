package Enums;

public class SwithEx1 {
    public static void main(String[] args) {

        //String name = "Please drink coffee\\tea in India";
        String name = "\"Logic will get you from A to Z imagina......\"t";
        System.out.println(name);


        int canis = 3;
        String type = switch (canis) {
            case 1 -> "dog";
            case 2 -> "wolf";
            case 3 -> "coyote";
            default -> "not canis";   //this covers all values , if this line is not there we will get compilrer error
            //default is must if the switch value is not enum
        };
    }
    enum Seasons {WINTER, SPRING, SUMMER, FALL}

    String getWeather (Seasons value)
    {
        return switch (value) {
            case WINTER -> "Cold";
            case  SPRING ->"Rainy ";
            case SUMMER -> "Hot";
            case  FALL -> "Warm";
            //default -> "Unown";
            //case WARM -> "TOO WARM"
        };
    }


}
