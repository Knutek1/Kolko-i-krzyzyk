package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OperationsClass implements ArrayOperations {

    @Override
    public double getAverage(int[] numbers){
        IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .forEach(System.out::println);


        OptionalDouble optionalDouble = IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average();
        double value = optionalDouble.orElse(-1);
        return value;
    }

}
