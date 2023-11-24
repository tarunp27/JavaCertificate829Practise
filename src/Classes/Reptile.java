package Classes;

public class Reptile {
    protected static int speed = 20;
}
class Croodile extends Reptile{
    protected int speed = 20;
    public int getSpeed() {
        return super.speed;
    }

    public static void main(String[] args) {
        var croc = new Croodile();
        System.out.println(croc.getSpeed());
    }
}
