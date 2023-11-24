package Interface;

interface Nocturnal{
    public int hunt();
}
interface canFly{
    public void flap();
}
interface HasBigEyes extends Nocturnal,canFly{}

public class Owl implements Nocturnal,canFly{
    @Override
    public int hunt() {
        return 5;
    }

    @Override
    public void flap() {
        System.out.println("flap");
    }
}
interface Sing{
    float volume = 10.0F;
}



