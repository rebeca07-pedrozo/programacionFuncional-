package com.platzi.functional._14_optionals;
 import java.util.*;

public class Optionals{
     public static void main(String[] args) {
         List<String> names = getNames();
         if(names != null){

         }
         Optional<List<String>> optionalNames= getOptionalNames();
         if(optionalNames.isPresent()){

         }
         optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));
         Optional<String> valuablePlayer = optionalValuablePlayer();
         String valuablePlayerName = valuablePlayer.orElseGet(() -> "No player");
     }
     static List<String> getNames(){
         List<String> list = new LinkedList<>();
         return Collections.emptyList();
     }
     static String mostValuablePlayer(){
         return null;
     }
     static int mostExpensiveItem(){
         return -1;
     }
     static Optional<List<String>> getOptionalNames(){
        List<String> namesList = new LinkedList<>();
        return Optional.of(namesList);
     }
     static Optional<String> optionalValuablePlayer(){
        // return Optional.ofNullable()
         try {
             return Optional.of("Sinuhe");
         }catch (Exception e){
             e.printStackTrace();
         }
         return Optional.empty();
     }
 }