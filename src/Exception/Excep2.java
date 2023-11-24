package Exception;

public class Excep2 {
    public static void main(String[] args) {
        try {
            String[] animals = new String[0];
            System.out.println(animals[0]);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}


