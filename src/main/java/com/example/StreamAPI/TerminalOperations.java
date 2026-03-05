package com.example.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {
    static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    static int productNumbers = numbers.stream().reduce(1, (a, b) -> a * b); // can't use List for compatibility type
    // El punto 4.2 no lo entendia y tuve que ver la solucion
    static List<Person> people = Arrays.asList(
            new Person("Alice", 25, "NYC"),
            new Person("Bob", 17, "LA"),
            new Person("Charlie", 30, "NYC"));

    // a) Group by city
    static Map<String, List<Person>> byCity = people.stream()
            .collect(Collectors.groupingBy(Person::getCity));

    // b) Count per city
    static Map<String, Long> countByCity = people.stream()
            .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));

    // c) Average age per city
    static Map<String, Double> avgAgeByCity = people.stream()
            .collect(Collectors.groupingBy(
                    Person::getCity,
                    Collectors.averagingInt(Person::getAge)));

    // d) Partition into adults and minors
    static Map<Boolean, List<Person>> partitioned = people.stream()
            .collect(Collectors.partitioningBy(p -> p.getAge() >= 18));


    // 4.3
    static List<String> data = Arrays.asList(
            "Java",               // Corto (4)
            "StreamAPI",          // Medio (9)
            "FullStack",          // Medio (9)
            "Unit-test-JUnit",    // Largo y con "test" (15)
            "Spring",             // Medio (6)
            "test",               // Corto y exacto (4)
            "Microservices",      // Largo (13)
            "Software-Testing"    // Largo y con "test" (16)
        );
    // static List<String> stringStartWhithJ = data.stream().filter(n -> n.startsWith("J")).collect(Collectors.toList());
    static boolean starWithJ = data.stream().anyMatch(s -> s.toUpperCase().startsWith("J"));
    static boolean longerThan3 = data.stream().allMatch(s -> s.length()>3);
    static Optional findTest = data.stream().filter(s -> s.toLowerCase().contains("test")).findFirst();
    public static void main(String[] args) {
        System.out.println(starWithJ);
        System.out.println(longerThan3);
        System.out.println(findTest);

    }
}
