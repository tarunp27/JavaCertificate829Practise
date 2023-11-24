package Exception;

public class MainGoHome {
    int goHome(){
        try{
//            throw new RuntimeException();
            System.out.println("1");
            return -1;
        }
        catch (Exception e){
            System.out.println("2");
            return -2;
        }
        finally {
            System.out.println("3");
            return -3;
        }
    }
    public static void main(String[] args) {
        int result =new MainGoHome().goHome();
        System.out.println(result);
    }
}
