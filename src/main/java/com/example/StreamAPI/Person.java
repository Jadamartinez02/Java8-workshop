package com.example.StreamAPI;

public class Person {
    String name;
    int age;
    String city;
    
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
    
}
