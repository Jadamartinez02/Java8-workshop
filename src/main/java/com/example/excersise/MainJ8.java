package com.example.excersise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainJ8 {
    // Excersise 1
    // ---------------------------------------------------------------------------

    // Sumar
    static Operation additionOperation = (x, y) -> x + y;
    // Multiplicar
    static Operation multuplyOperation = (x, y) -> x * y;
    // Division
    static Operation divisionOperation = (x, y) -> {
        if (y <= 0) {
            throw new ArithmeticException("Can't use 0 for split");
        } else {
            double result = x / y;
            return result;
        }

    };
    // Resta
    static Operation substractionOperation = (x, y) -> x - y;

    public static void showOperations() {
        System.out.println(divisionOperation.acept(10, 1));
        System.out.println(additionOperation.acept(5, 5));
        System.out.println(multuplyOperation.acept(2, 5));
        System.out.println(substractionOperation.acept(15, 7));
    }

    // Excecise 2
    // -------------------------------------------------------------------------
    static List<String> nameList = Arrays.asList(
            "Alejandro", "Beatriz", "Carlos", "Daniela", "Eduardo",
            "Fernanda", "Gabriel", "Helena", "Iván", "Julieta",
            "Kevin", "Lucía", "Mateo", "Natalia", "Óscar",
            "Paola", "Quique", "Rosa", "Santiago", "Teresa",
            "Ulises", "Valeria", "Walter", "Ximena", "Yolanda");
    static List<String> filterNamesForA = nameList.stream()
    .filter(n -> n.startsWith("A"))
    .map(String::toUpperCase).sorted().collect(Collectors.toList());

    // Excercise 3 -------------------------------------------------------------------
    
    static Predicate<String> nameStarWhitA = s -> s.startsWith("A");
    // static Consumer <List<String>> nameFilter =  s -> {
    //     if (nameStarWhitA.te st(s)) {
    //         System.out.println(filterNamesForA);     
    //     } else{
    //         System.out.println("don't exist name with A");
    //     }
    // };
    

    public static void main(String[] args) {
        showOperations();
        System.out.println(filterNamesForA);
        
    }

}
