package dev.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Java8_Builtin_Functional_Interfaces {

    public static void main(String[] args) {

        Stream.generate(() -> new Random().nextInt()) // supplier
                .limit(5)
                .forEach((e) -> System.out.println(e)); // consumer

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream()
                .filter(e -> e % 2 == 0) // predicate
                .map(e -> e.doubleValue()) // function
                .reduce((e1, e2) -> e1 + e2) // BinaryOperator
                .ifPresent(System.out::println);

    }
}
