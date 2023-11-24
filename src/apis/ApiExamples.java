package apis;

public class ApiExamples {
    public static void main(String[] args) {
        String str1 = "Pugalendi";
        String str2 = str1.concat("Arumugam");
        System.out.println(str1);
        System.out.println(str2);
        String str0 = "TarunP";

        StringBuilder sb1 = new StringBuilder("Tarun");
        sb1.append("Pugalendi");
        System.out.println(sb1);

        System.out.println(str1.charAt(3));
        //System.out.println(str1.charAt(-1));//exception

        System.out.println(str1.substring(2,4));
        System.out.println(str1.substring(2,2));
       // System.out.println(str1.substring(2,7));//exception

       /* System.out.println(str0.compareTo(str2));

        String [] strarr = str2.split("l");
        for(String str: strarr){
            System.out.println(str);
        }
        */

        System.out.println(str2.valueOf(3));
    }
}
