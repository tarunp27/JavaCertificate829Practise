package Optional;

import java.util.Optional;

public class OptionalEx {
    public static Optional<Double> avgerage(int... scores){
        if(scores.length == 0){
            return Optional.empty();
        }
        int sum =0;
        for ( int score : scores){
            sum+=score;
        }
        return Optional.of((double) sum / scores.length);

    }
    public static void main(String[] args) {
        System.out.println( avgerage(90,100));
        System.out.println(avgerage());
        System.out.println(avgerage(100,200,300,400,500));

//        Optional<Double> opt = avgerage(50,75);
//        Optional<Double> opt2 = avgerage();

//        if(opt.isPresent()){
//            System.out.println(opt.get());
//            opt.ifPresent(x -> System.out.println(x));
//            System.out.println(opt2.orElseGet(()->Math.random()));
//        }
    }
}
