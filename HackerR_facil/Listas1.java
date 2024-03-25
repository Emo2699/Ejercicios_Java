/**
 * En este problema se solicita el manejo de listas de una forma correcta y sencilla
 * La esencia del problema consiste en la insercion y eliminacion de elementos en una lista
 * de acuerdo a los indices.
 * 
 * La insercion de un elemento puede ser en cualquier parte de la lista y los elementos a la derecha
 * se tendran que recorrer, se recomienda leer el API de java para entender los metodos de la clae List
 * 
 * Fuente: HR Data Structures Java List
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Listas1 {

    public static void main(String[] args) throws IOException {
        
        //Creo mi bufferReader para leer desde la consola
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        //Leo el numero de enteros en la lista
        int numeroElementos = Integer.parseInt(teclado.readLine());

        //Leo y separo en un arreglo de Strings los elementos leidos
        String[] elementos = teclado.readLine().replaceAll("\\s+$","").split(" ");

        //Creo la lista donde almacenare los elementos convertidos en numeros
        List<Integer> numeros = new ArrayList<>();

        //Agrego los elementos a la lista
        // for(String elemento: elementos){
        //     numeros.add(Integer.parseInt(elemento));
        // }
        for(int i = 0; i < numeroElementos; i++)
            numeros.add(Integer.parseInt(elementos[i]));

        //Leo el numeros de queries a realizar
        int queries = Integer.parseInt(teclado.readLine());

        //Creo un bucle para leer las queries y hacer sus operaciones.
        for(int i = 0; i < queries; i++){
            try{
                
                //Leo el tipo de operacion
                String op = teclado.readLine();


                if(op.equals("Insert")){
                    String[] entrada = teclado.readLine().replaceAll("\\s+$","").split(" ");

                    if(Integer.parseInt(entrada[0]) >= numeros.size())
                        numeros.add(Integer.parseInt(entrada[1]));
                    else
                        numeros.add(Integer.parseInt(entrada[0]), Integer.parseInt(entrada[1]));
                    
                    //Lineas para ver la lista en cada operacion realizada
                    System.out.println("Tam lista: "+numeros.size());
                    System.out.println(numeros);
                }
                
                if(op.equals("Delete")){

                    int indice = Integer.parseInt(teclado.readLine());

                    if(indice < numeros.size())
                        numeros.remove(indice);
                    
                    //Lineas para ver la lista en cada operacion realizada
                    System.out.println("Tam lista: "+numeros.size());
                    System.out.println(numeros);
                    
                }
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
        //Cierro el buffer
        teclado.close();

        //Imprimo la lista
        for(Integer numero: numeros){
            System.out.printf("%d ", numero);
        }
    }    
}
