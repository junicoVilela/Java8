package dev.java.lambda;

import java.util.stream.IntStream;

public class Java8_Lambda {

    public static void main(String[] args) {

        // Parênteses
        Runnable runnable = () -> System.out.println("Se inscreva no canal!");

        IntStream.range(0, 5)
                .filter((int n) -> n % 2 == 0)
                .reduce((n1, n2) -> n1 + n2)
                .ifPresent(System.out::println);

        // Chaves
        IntStream.range(0, 5)
                .filter((int n) -> {
                    System.out.println("Se inscreva no canal!");
                    return n % 2 == 0;
                })
                .forEach(System.out::println);

    }
}
