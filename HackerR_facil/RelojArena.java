/**
 * Problema de reloj de Arena en Java
 * 
 * Este problema consiste en el manejo de matrices o arreglos en 2D
 * Un reloj de arena tiene la siguiente forma.
 *  +++
 *   +
 *  +++
 * 
 * Donde cada "+" representa un elemento numerico y el resultado de un reloj de arena 
 * es la suma de cada uno de esos elementos.
 * La idea es que a partir de una matriz de 6x6 se tiene que calcular el relog con mayor valor
 * y ese valor se tiene que mostrar en consola.
 * 
 * Fuente: HR Java 2D Array.
 * 
 */


import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class RelojArena {
    

    public static void main(String[] args) throws IOException{
        //Declaro un buffer de lectura para los reglones de entrada
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //Creo una lista de listas de enteros
        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0,6).forEach(i -> {
            try{
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            }catch(IOException e){
                throw new RuntimeException(e);
            }
        });
        bufferedReader.close();

        // System.out.println(arr);
        // for(int i = 0; i < arr.size(); i++){
        //     System.out.println(arr.get(i));
        // }

        //Nota: En caso de tambien aceptar numeros negativos la inicializacion de Rfinal
        //cambia a un numero negativo mucho menor, Ej -1000
        int Rfinal = 0, i = 0, j = 2;
        while(j - i == 2 && j < arr.size()){
            int relojFila = relojArena(arr.get(i), arr.get(i+1), arr.get(j));

            if(relojFila > Rfinal){
                Rfinal = relojFila;
            }

            i++;j++;
        }

        System.out.println(Rfinal);

        // List<Integer> l1 = Arrays.asList(0, 0, 2, 4, 4, 0);
        // List<Integer> l2 = Arrays.asList(0, 0, 0, 2, 0, 0);
        // List<Integer> l3 = Arrays.asList(0, 0, 1, 2, 4, 0);

        // System.out.println(relojArena(l1, l2, l3));
    }

    public static int relojArena(List<Integer> arriba, List<Integer> medio, List<Integer> abajo){
        int i = 0, j = 2;
        //Nota: En caso de tambien aceptar numeros negativos la inicializacion de resultado
        //cambia a un numero negativo mucho menor, Ej -1000
        int resultado = 0;
        while(j-i == 2 && j < arriba.size()){
            int parteArriba = arriba.get(i) + arriba.get(i+1) + arriba.get(j);
            int parteAbajo = abajo.get(i) + abajo.get(i+1) + abajo.get(j);
            int res = parteArriba + medio.get(i+1) + parteAbajo;
            if(res > resultado ){
                resultado = res;
            }
            i++;j++;
        }
        return resultado; 
    }
}
