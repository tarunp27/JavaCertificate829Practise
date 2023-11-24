package MultiThread;

import java.util.List;

public class ParralelReduce {
    public static void main(String[] args) {
        System.out.println(List.of("w","o","l","f")
                .parallelStream()
                .reduce("X",String::concat)
        );

        System.out.println(List.of(1,2,3,4,5,6)
                .parallelStream()
                .reduce(0,(a,b)->(a-b))
        );
    }
}
//in parallel stream the identity is applied tp multiple elements in the stream resulting unexpected data.
