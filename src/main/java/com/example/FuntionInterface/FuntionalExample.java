package com.example.FuntionInterface;

import java.util.function.Function;

public class FuntionalExample {
    static Function<String, String> toLowercase = s -> s.replace(" ","").toLowerCase();
    static Function<String, String> emailDomain = s -> {
        int emailDomain = s.indexOf("@");
        return s.substring(emailDomain +1);
    };

    public static void main(String[] args) {
        
        System.out.println(toLowercase.compose(emailDomain).apply("javier.martinez02@Globant.com"));
    }

}
