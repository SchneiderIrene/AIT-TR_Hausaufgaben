package hausaufgaben_45;

import java.util.function.*;

public class HA_45 {
    public static void main(String[] args) {

        Predicate<Integer>predicate = i -> i>2;
        System.out.println(predicate.test(8));

        BiFunction<String, String, Integer> biFunction =
                (a, b) -> Integer.parseInt(a.trim()) + Integer.parseInt(b.trim());
        System.out.println(biFunction.apply("4", "2"));

        Supplier<String>stringSupplier = () -> "Java Forever!";
        System.out.println(stringSupplier.get());

        Consumer<Integer>consumer = i-> System.out.println(i*i);
        consumer.accept(6);

        Function<Integer, String> function= i -> i*i + "!!!";
        System.out.println(function.apply(7));

        BinaryOperator<Integer> plus = Integer::sum;
        System.out.println(plus.apply(1,2));

        UnaryOperator<Integer> square = a -> a*a;
        System.out.println(square.apply(2));



    }



}
