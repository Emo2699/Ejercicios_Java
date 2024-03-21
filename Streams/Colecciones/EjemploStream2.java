package Streams.Colecciones;

import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*      USO DE MAP()    */ 

/**
 * El metodo map() aplica una funcion a cada elemento del flujo original y crear un
 * nuevo flujo.
 * 
 * La operacion que aplica es una funcion de transformacion y el resultado se alamcena en un nuevo
 * flujo diferente al original.
 */
public class EjemploStream2 {
    public static void main(String[] args) {
        

        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe")
            .map(nombre -> {
                return nombre.toUpperCase();
            });

            /*La sintaxis de arriba se puede sustituir por la siguiente
             * 
             * map(nombre -> nombre.toUpperCase())
             * 
            */
        //nombres.forEach(System.out::println);    

        /*Una mejor forma de escribir todo lo anterior*/
        Stream<String>nombres2 = Stream.of("Pato", "Paco", "Pepa", "Pepe")
            .map(String::toUpperCase)
            .peek(System.out::println)
            .map(String::toLowerCase);

        
        //nombres2.forEach(System.out::println);    
        
        /*Otro operador terminal puede ser convirtiendo el flujo en una lista*/
        List<String> lista = nombres2.collect(Collectors.toList());
        
        //Con la linea de arriba, ya se crea el flujo y se le aplica los cambios con los maps
        lista.forEach(System.out::println);


    }
}
