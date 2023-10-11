package edu.camilo.java.optional;

import java.util.Optional;


public class TestOptional {
    public static void main(String[] args) {
//        Optional<String> optionalValue = Optional.ofNullable("irineu");
//        String result = optionalValue.orElse("Default");
//        System.out.println(result);



        String nullableValue = null;
        Optional<String> optionalValue = Optional.ofNullable(nullableValue);
        System.out.println(optionalValue.isPresent());

    }
}
