package VarArgs;

public class Primitive {
    public static void main(String[] args) {
        new Primitive().printVarargs(new String[2]);
    }

    public void printVarargs(String[] ages){
        System.out.println(ages[1]);
    }
}
