package com.platzi.functional._11_composition;

import java.util.function.Function;

public class MathOperations2 {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy3= x-> {
            System.out.println("Multiplicando x:"+ x+ "por 3");;
            return x*3;
        };

        Function< Integer, Integer> addMultiplyBy3=
                multiplyBy3.compose(y-> {
                    System.out.println("Agrege 1 a: "+y);
                    return y+1;
                });
        System.out.println(
                addMultiplyBy3.apply(5)
        );
    }
}
