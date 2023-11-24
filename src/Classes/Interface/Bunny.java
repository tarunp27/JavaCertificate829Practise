package Classes.Interface;

public class Bunny {
    public int Skip(){
        return Hop.getJumpHeight();
    }

    public static void main(String[] args) {
        System.out.println(new Bunny().Skip());
        System.out.println();
        System.out.println();
        Bunny b = new Bunny();
        b.Skip();
        //System.out.println(height);
    }
}
