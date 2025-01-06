package com.platzi.functional._05_sam;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {
    static Function<Integer, String> addCeros = x -> x < 10 ? "0" + x : String.valueOf(x);
    public static void main(String[] args) {
        TriFunction< Integer, Integer, Integer, LocalDate> parseDate =
        (day, month, year) -> LocalDate.parse(
                year + "-" + addCeros.apply(month) + "-" + addCeros.apply(day));
        TriFunction< Integer, Integer, Integer, Integer> calculateAge =
                (day, month, year) -> Period.between(
                        parseDate.apply(day,month,year), LocalDate.now()
                ).getYears();
        System.out.println(calculateAge.apply(7,5,2006));
    }

    @FunctionalInterface
    interface TriFunction< T, U, V, R>{
        R apply(T t, U u, V v);
    }

}
