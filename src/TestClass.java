public class TestClass {
    public static void main(String[] args) {
        final short s = 127;
        byte b = s;


        String eyeTest =  "\"Java Study Guide\"\n  by Scott & Jeanne";
        System.out.println(eyeTest);

        String textBlock = """ 
                "Java Text Block" 
                  by Scott and Jeanne""";

        System.out.println(textBlock);

        String block = """
            "doe\"\"\"
            \"deer\"""
          """;

        System.out.println("*"+ block +"*");

        int a , v =4;
        a=6;
        System.out.println(a+v);

//        throw new ArrayIndexOutOfBoundsException();
        //throw new RuntimeException();

        System.out.println(eyeTest.startsWith("J"));

    }
}
