package Interface;

//interface Dances1{
//   Integer  CountMoves();
//}
interface EatsFish1{
    Number CountMoves();
}
public class Penguin2 implements EatsFish1 {
    public Integer CountMoves() {
        System.out.println("child Class");
        return 4;
    }

    public static void main(String[] args) {
        new Penguin2().CountMoves();
    }
}
