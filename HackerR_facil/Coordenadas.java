/*
 * En este problema se hace uso de las listas, principalmente del concepto de
 * listas de listas. La entrada pregunta por un elemento en tal coordenada compuesta 
 * por dos numeros, el programa debe de devolver el elemento de esa coordenada en caso de que exista
 * o la palabra "ERROR!!" si no existe.
 * 
 * Tambien a partir de la entrada se crea la lista de listas, ya que en las lineas de entrada
 * vienen los elementos a guardar en las listas.
 * 
 * Fuente: HR Data Structures Java ArrayList
 * 
 * 
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Coordenadas {

    public static void main(String[] args) throws IOException{
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        //Leo el numero de lineas que contendra el array inicial
        int n = Integer.parseInt(teclado.readLine());

        //Creo mi lista de listas
        List<List<Integer>> lista = new ArrayList<>();

        for(int i = 0; i < n; i++){
            //Separo en un arreglo de cadenas los numeros ingresados por linea (fila)
            String[] entrada = teclado.readLine().replaceAll("\\s+$","").split(" ");

            //Creo mi lista auxiliar
            List<Integer> aux = new ArrayList<>();

            //El primer elemento del arreglo es el tamaño de la lista auxiliar
            //Por lo que dicho elemento sera el que utilizaremos para iterar 
            for(int j = 0; j < Integer.parseInt(entrada[0]); j++){
                aux.add(Integer.parseInt(entrada[j+1]));
            }

            lista.add(aux);
        }

        //Leo el numero de queries
        int q = Integer.parseInt(teclado.readLine());
        List<String> resultados = new ArrayList<>();
        for(int i = 0; i < q; i++){
            try{
                //Separo en un arreglo de cadenas las coordenadas buscadas
                String[] coordenadas = teclado.readLine().replaceAll("\\s+$","").split(" ");

                //Busco en la matriz el valor en la coordenada solicitada
                int resultado = lista.get(Integer.parseInt(coordenadas[0])-1).get(Integer.parseInt(coordenadas[1])-1);

                // System.out.println(resultado);
                resultados.add(Integer.toString(resultado));
            }catch(Exception e){
                // System.out.println("ERROR!");
                resultados.add("ERROR!");
            }
        }

        for(String resultado: resultados){
            System.out.println(resultado);
        }

    }
    
}
