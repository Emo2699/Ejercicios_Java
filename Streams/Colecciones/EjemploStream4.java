package Streams.Colecciones;

//import java.util.List;
import java.util.Optional;
//import java.util.stream.Collectors;
import java.util.stream.Stream;

import Streams.Colecciones.models.Usuario;

/*      USO DE FILTTER()        */


public class EjemploStream4 {


    public static void main(String[] args) {
        Stream<Usuario> usuarios = Stream.of("Erick Ramirez", "Karina Ramirez", "Pedro Sola")
            //Utilizamos map para cambiar las string del of() por objetos del tipo Usuario
            .map(nombre -> {
                Usuario usr = new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]);
                return usr;
            })
            //Filtracion por apellido
            .filter(usr -> usr.getApellido().equals("Ramirez"));

        
        //Lista con todos los objetos filtrados
        //List<Usuario> lista = usuarios.collect(Collectors.toList());  
        //System.out.println(lista);  

        //Si se desea solo un elemento filtrado
        Optional<Usuario> usr = usuarios.findFirst();
        System.out.println(usr.get());

        /*
         * NOTA: Imprimir al mismo tiempo la Lista y el objeto Optional 
         * No se puede hacer, ya que cuando se crea la lista, esa operacion es un metodo
         * terminal, por lo que cierra el flujo, impidiendo la operacion de abajo con el
         * Objeto Optional.
         * 
         * Hay que tener cuidado cuando se cierran los flujos 
        */

        version2();
    }

    public static void version2(){
        Usuario usuario = Stream.of("Erick Ramirez", "Karina Ramirez", "Pedro Sola")
            .map(nombre -> {
                Usuario usr = new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]);
                return usr;
            })
            .filter(usr -> usr.getId().equals(2))
            .findFirst().get();

        System.out.println(usuario);    
    }
}
