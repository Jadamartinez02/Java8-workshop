package com.example.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class OptionalClass {
    // 5.2 solution
    // class Company {
    //     private Optional<Address> address;

    //     public Optional<Address> getAddress() {
    //         return address;
    //     }
    // }

    // class Address {
    //     private Optional<String> zipCode;

    //     public Optional<String> getZipCode() {
    //         return zipCode;
    //     }
    // }

    // // Extract zipCode safely
    // String zipCode = company
    //         .getAddress()
    //         .flatMap(Address::getZipCode)
    //         .orElse("00000");
    // 5.1 solucion improvisada 
    public Optional<Person> searchById(Integer age) {
        if (age == 1L) {
            return Optional.of(new Person("Mafe", 30, "Pasto"));
        }
        return Optional.empty();
    }

    static List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

    static Optional<String> namOptional = names.stream().filter( s -> s.startsWith("C")).findFirst();
    
    public static void main(String[] args) {
        System.out.println(namOptional);
    }

}
