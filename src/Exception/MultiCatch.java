package Exception;

public class MultiCatch {
    public void visitSnakes() {
        try {
            System.out.println("Try");
        }
        catch(IllegalArgumentException e1){
            System.out.println(e1.getMessage());
        }
//        catch (NumberFormatException e2){
//            System.out.println(e2.getMessage());       // numberformatexception is a  subclass of illegalFE
//                                                       // therfore it is unreacchable clock of code

//            System.out.println(e1.getMesage());       // e1 cannot be accessed here. it belongs to first catch
//        }                                              //
    }

    public void visitMonkeys(){
        try{
            System.out.println("try");
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
       // catch (IllegalArgumentException | NumberFormatException e){    // cannot give like this as one is subclass of another
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) {

    }
}
