package com.platzi.functional._09_defaults;

public class StringFunctions {
   @FunctionalInterface
     interface StringOperation{
    int getAmount();
    default void operate(String text){
        int x = getAmount();
        while(x --> 0){
            System.out.println(text);
        }
    }
   }
   @FunctionalInterface
   interface doOperation{
       void take (String text);
       default void execute (int x){
           while(x --> 0){
               
           }
       }
   }

    public static void main(String[] args) {
       StringOperation six = () -> 6;
       six.operate("Alumno");
    }
}
