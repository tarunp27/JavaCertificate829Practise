public class FunWithArgs {
    public static void main(String[][] args) {
        String []temp1 = {"Hello","Hi!"};
        String [][]temp2 = {temp1};
        System.out.println(temp2[0][0]);
        System.out.println(temp2[1][0]);
        System.out.println(args[0][1]);
    }

    public static void main(String[] args) {
        var fwa = new FunWithArgs();
        String[][] newargs = {args};
        fwa.main(newargs);

//        int getValue(){
//            return new int[]{ 1 };
//        }
    }
}
