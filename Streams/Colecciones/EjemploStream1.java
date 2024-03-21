package Streams.Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream1 {
    
    public static void main(String[] args) {

        /*      FORMA 1 DE CREAR UN STREAM      */
        //Esta linea crea un flujo a partir de lo que se le pase como argumento al metodo of()
        //por debajo, el metodo of crea un arreglo con el argumento
        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");

        //Iteramos sobre el flujo, usamos expresiones lambda para tener una sintaxis más limpia
        nombres.forEach(nombre -> System.out.println(nombre));

        //La linea de arriba tambien se puede escribir asi
        //nombres.forEach(System.out::println);


        /*      FORMA 2 DE CREAR UN STREAM      */
        String [] arreglo2 = {"Pato", "Paco", "Pepa", "Pepe"};

        Stream<String> flujo2 = Arrays.stream(arreglo2);
        flujo2.forEach(System.out::println);


        /*      FORMA 3 DE CREAR UN STREAM (BUILDER)       */
        Stream<String> flujo3 = Stream.<String>builder()
                .add("Pato")
                .add("Paco")
                .add("Pepa")
                .add("Pepe")
                .build();

        flujo3.forEach(System.out::println);  
        
        
        /*      FORMA DE CREAR UN STREAM (A PARTIR DE UN COLLECTION)        */
        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepa");
        lista.add("Pepe");

        // Stream<String> flujo4 = lista.stream();
        // flujo4.forEach(System.out::println);

        //No necesariamente se debe de crear la variable stream
        lista.stream().forEach(System.out::println);
    }
}
