package com.example;


public class Main {
        public static void main(String[] args) {
        Operation sum = (a,b) -> a+b; 
        Integer sum1 = sum.sumNumber(12, 16);
        System.out.println(sum1);
        
        // StringPorcessor stringToOperCase = s -> {
        //     s.toUpperCase();
        //     return s;
        // };
        StringPorcessor operCase = s -> s.toUpperCase();
        StringPorcessor reverseProcessor = s -> new StringBuilder(s).reverse().toString();
        System.out.println(reverseProcessor.methorProcessor("Maria Fernanda"));
        //String toOperCase = stringToOperCase.methorProcessor("Hola");
        //System.out.println(toOperCase);

        String opeString = operCase.methorProcessor("Hola si, probando ");
        System.out.println(opeString);

        StringPorcessor deleteSpaces = s -> s.replaceAll("\\s+", "");
        System.out.println(deleteSpaces.methorProcessor("Hola   javier mafee  fastidiosa"));
        // StringPorcessor StringReverse = s -> {
        //   for(int i = 0; i < s.length(); i-- ){
        //     System.out.println(s);
        //   }  
        // };
        // List<String> lista = List.of("Hola", "algo", "si");
        // String algo = lista.stream();
    }
}