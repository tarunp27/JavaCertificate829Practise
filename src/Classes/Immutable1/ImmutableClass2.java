package Classes.Immutable1;
//mutable object
class Engine{
    int speed;
    Engine(int speed){
        this.speed=speed;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "speed=" + speed +
                '}';
    }
}
public class ImmutableClass2 {
    private final int id;
    private final String name;
    private final Engine engine;

    public ImmutableClass2(int id,String s, Engine e){
        this.id=id;
        this.name =s;
        this.engine =e;
    }

    public int getid(){
        return id;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "ImmutableClass2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}

class TestMain{
    public static void main(String[] args) {
        Engine e = new Engine(50);
        ImmutableClass2 a = new ImmutableClass2(1,"java",e);
        System.out.println(a);
        e.speed=70;
        System.out.println(a);
    }
}
