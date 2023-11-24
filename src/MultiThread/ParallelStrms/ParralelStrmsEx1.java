package MultiThread.ParallelStrms;
import java.sql.SQLOutput;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class ParralelStrmsEx1 {
    public static void main(String[] args) {
        Collection<Integer> coll = List.of(1,2,3,4);

        Stream<Integer> p1 = coll.stream().parallel();
        Stream<Integer> p2 = coll.parallelStream();
        Stream<Integer> s1= Stream.of(1,2,3,4);
        Stream<Integer> s2 = s1.parallel();            //cannot put s1.parralel stream

        System.out.println(s1.isParallel());         //s1 becaome parallel
        System.out.println(s2.isParallel());

        List.of(1,2,3,4,5,6,7,8,9,10)
                .parallelStream()
                .skip(2)
                .limit(4)
                .forEach(x->System.out.print(x+" "));
//                .findAny()
//                .get());
        System.out.println();

//        System.out.println("-------------------------------------------");
//        Stream<Integer> s = List.of(1,2,3,4).stream().unordered().parallel();
//        s.forEach(System.out::print);
//        System.out.println();
//
//        System.out.println("--------------------------------------------");
//        System.out.println(List.of('w','o','l','f')
//                .parallelStream()
//                .reduce("",
//                        (w1,c)->w1+c,
//                        (w2,w3)->w2+w3));
        System.out.println("-------------------------------------");
        System.out.println(List.of(1,2,3,4,5,6)
                .parallelStream()
                .reduce(-1,(a,b)->a-b));
        System.out.println("---------------------------------------");
        System.out.println(List.of("w","o","l","f")
                .parallelStream()
                .reduce("X",(w1,c)->w1+c,
                        (w2,w3)->w2+w3));
        int a = 100;
        int b= 90;
        a%=b;
    }
}
