package Streams.Colecciones;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Streams.Colecciones.models.Usuario;

public class EjemploStream3 {
    
    /*Ejemplo de uso de Map con una clase propia*/

    public static void main(String[] args) {
        
        Stream<Usuario> usuarios = Stream.of("Erick Ramirez", "Karina Ramirez", "Pedro Sola")
            //Utilizamos map para cambiar las string del of() por objetos del tipo Usuario
            .map(nombre -> {
                Usuario usr = new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]);
                return usr;
            });
            // .peek(System.out::println);

        List<Usuario> lista = usuarios.collect(Collectors.toList());
        lista.forEach(System.out::println);

    }
}
