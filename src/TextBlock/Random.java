package TextBlock;

public class Random {
    //    static double getDoubleUsingSwitch(Object o){
//        return switch (o){
//            case Integer i ->i.doubleValue();
//            case Float f -> f.doubleValue();
//            case String s -> Double.parseDouble(s);
//            default -> 0d;
//            };
//    }
    public static void main(String[] args) {
        //Random.getDoubleUsingSwitch();
        //Object object = "Name";
        Object object = 9;
        if (object instanceof String s) {
            int length = s.length();
            System.out.println("The length is:" + length);
        } else {
            System.out.println("This object is not a string");
        }
        Double pi = Math.PI;
        //  if(pi instanceof String s){     //cannot convert java.lan.double to java.lan.string

        int ob = 10;
        final int i = 10;
        String formatter = switch (ob) {
            case  i -> String.format("ind %d", i);
            default -> "other value";
        };
    }
}

