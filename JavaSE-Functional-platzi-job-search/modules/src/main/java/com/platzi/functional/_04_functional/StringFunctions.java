package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";
        System.out.println(quote.apply("Corrobar resultado"));
        System.out.println(addMark.apply("Hello"));

        BiFunction< String, Integer, String> leftPad =
                (text, number) -> String.format ("%" + number + "s", text);
        System.out.println(leftPad.apply("Java", 10));
    }
}
