package Classes.Interface;

public interface Hop {
    static int getJumpHeight(){
        ride();
        //goFast();
        return 10;
    }
    private void goFast(){
        System.out.println("Fast");
        ride();
        System.out.println(getJumpHeight());
    }
    private static void ride(){
        System.out.println("Ride MEthod");
    }
    default void playHorn(){
        System.out.println("Horn");
        ride();
    }
}
