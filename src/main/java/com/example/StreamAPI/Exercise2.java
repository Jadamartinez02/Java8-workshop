package com.example.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise2 {
    //2.1
    static List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 3, 15, 7, 18);

    static List<Integer> newbumbers = numbers.stream().filter(n -> n % 2 == 0 && n >= 10).sorted()
            .collect(Collectors.toList());
    //2.2
    static List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

    static List<Integer> numberNames = names.stream().map(String::length).sorted().collect(Collectors.toList());
    //2.3
    static List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8, 9));
    static List<Integer> numberList = listOfLists.stream().flatMap(names -> names.stream()).collect(Collectors.toList());
    //3.1 Distinc and sorted
    static List<String> words = Arrays.asList("apple", "Banana", "apple", "Cherry", "banana", "Date");
    static List<String> wordsCaseInsensitive = words.stream().map(String::toLowerCase).distinct().sorted().collect(Collectors.toList());
    //3.2 Limit and skip
    static List<Integer> moreNumber = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList()); //No sabia que exisitia, gracias gemini, yo solo te pedi una lista del 1 al 100 💕
    static List<Integer> numbersFilter =  moreNumber.stream().skip(19).limit(11).collect(Collectors.toList());    
    //3.3 Peek
    static List<Integer> numberPeek =  numbers.stream().peek(n -> System.out.println("Primera entrada: " + n)).filter(n -> n >= 10).peek(n -> System.out.println("Entrada filter "+ n) ).sorted().collect(Collectors.toList());
    
    public static void main(String[] args) {
        System.out.println(newbumbers);
        System.out.println(numberNames);
        System.out.println(numberList);
        System.out.println(wordsCaseInsensitive);
        System.out.println(numbersFilter);
        System.out.println("Filtrado numeros peek" + numberPeek);
    }

}
