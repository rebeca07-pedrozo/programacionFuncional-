package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        // Función para calcular el cuadrado de un número
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(square.apply(5));   // Salida: 25
        System.out.println(square.apply(25));  // Salida: 625

        // Función para verificar si un número es impar
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        // Predicate para verificar si un número es par
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4)); // true

        // Predicate para verificar si un estudiante está aprobado
        Predicate<Student> isApproved = student -> student.getCalificacion() >= 6.0;

        // Crear un estudiante y verificar si está aprobado
        Student Nequito = new Student(5.9);
        System.out.println(isApproved.test(Nequito));  // Salida: false
    }

    // Clase Student
    static class Student {
        private double calificacion;

        // Constructor para inicializar la calificación
        public Student(double calificacion) {
            this.calificacion = calificacion;
        }

        // Getter para obtener la calificación
        public double getCalificacion() {
            return calificacion;
        }
    }
}
