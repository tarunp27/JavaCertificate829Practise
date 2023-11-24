package Exception.TryRes;

public class MyFileClass implements AutoCloseable {
    private final int num;

    public MyFileClass(int num) {this.num = num;}

    public void close(){
        System.out.println("Closing: " + num);
    }

    public static void main(String[] args) {
        try(MyFileClass a1 = new MyFileClass(10);
            MyFileClass a2 = new MyFileClass(20)){      // this closed first
            throw new RuntimeException();
        }
        catch (Exception e ){
            System.out.println("e");
        }
        finally {
            System.out.println("finally");
        }
    }
}
