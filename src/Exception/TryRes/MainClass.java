package Exception.TryRes;

public class MainClass {
    public static void main(String[] args) {
        var myReader = new MyFileClass(10);
        //MyFileClass tarunReader  = null;           //cant be defined like this
        try(MyFileClass bookReader = new MyFileClass(1);
            MyFileClass movieReader = new MyFileClass(2);
            myReader){
            System.out.println("Try Block");
            //bookReader = new MyFileClass(5);    //effective final
            throw new RuntimeException();
        }
        catch (Exception e){
            System.out.println("Catch Block");
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
