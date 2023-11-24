package Streams;

import java.util.Optional;

public class OptionalExercise {
    public static void main(String[] args) {
        System.out.println(average(10,20,30,40,50));
        System.out.println(average());

        Optional<Double> opt1 = average();
        //if(opt1.isPresent()) System.out.println(opt1.get());
        System.out.println(opt1.orElse(Double.NaN));
    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) {
            sum += score;
        }
        return Optional.of((double)sum/scores.length);
    }
}
