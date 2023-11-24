package Classes.Immutable1;

public class ImmutableClass1 {
    private final int id;
    private final String name;

    public ImmutableClass1(int id,String s){
        this.id=id;
        this.name =s;
    }

    public int getid(){
        return id;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        ImmutableClass1 a = new ImmutableClass1(1,"java");
        System.out.println(a.name=="java");
        //a.id=22;      //it is immuatble so we cannot modify the value
        System.out.println(a.id);
    }
}
