package com.example.methodReferences;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {
    
    public static void main(String[] args) {
        List<String> list = List.of("abpsa", "aoshd");
        list.add("ghaus");
        List<String> expample = Arrays.asList("hola", "mafe");
        // expample.add("null");
        list.forEach(item -> System.out.println(item));
        list.forEach(System.out::println);

        list.stream().map(s -> s.toUpperCase());
        list.stream().map(String::toUpperCase);

        list.stream().filter(s -> s.isEmpty());
        list.stream().filter(String::isEmpty);
    }
}
