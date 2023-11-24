package Exception;

public class ComplexTryCtach {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String v = null;
        try{
            try {
                result.append("before_");
                v.length();
                result.append("after_");
            }
            catch(NullPointerException ne){
                result.append("catch_");
                throw new RuntimeException();
            }
            finally {
                result.append("finally_");
                throw new Exception();
            }
        }
        catch(Exception e){
            result.append("done");
        }
        System.out.println(result);
    }
}
