package Generics.New_Gnerics;

public class Handler {
    public static<U,X> void Prepare(U u,X x){
        //public static<> void Prepare(U u,X x){     //error need formal parameters
        System.out.println("Preparing T" +u);
    }
    public static <T> Crate<T,T> ship(T t){
        System.out.println("Shipping" +t);
        return new Crate<T,T>((T) "Tarun", (T) "Pugalendi");
    }
}
