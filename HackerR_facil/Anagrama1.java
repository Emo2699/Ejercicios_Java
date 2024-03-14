/*
 * Ejercicio de Anagramas
 * Un anagrama es cuando dos palarbas tienen las mismas letras y la misma cantidad
 * de repeticiones de la misma y forman palabras distintas.
 * 
 * Ej:
 * Amor
 * Roma
 * Mora
 * 
 * Fuente: Java Anagrams. -> HackerRank
 * Restriccion: El problema no debe de ser sensible a mayusculas o minusculas.
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Anagrama1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    public static boolean isAnagram(String p1, String p2){
        //Dos cosas a verificar, las mismas letras y la misma cantidad de repeticiones.

        String[] aux1 = p1.toLowerCase().split("");
        String[] aux2 = p2.toLowerCase().split("");

        Set<String>conjunto1 = new HashSet<>();
        Set<String>conjunto2 = new HashSet<>();

        for(String letra: aux1){
            conjunto1.add(letra);
        }

        for(String letra: aux2){
            conjunto2.add(letra);
        }

        System.out.println(conjunto1);
        System.out.println(conjunto2);

        //Condicion de igualdad en conjuntos (mismas letras)
        if(conjunto1.equals(conjunto2)){
            //Condicion de frecuencia en conjuntos (mismas repeticiones)
            Set<Integer>coincidencias1 = new HashSet<>();
            Set<Integer>coincidencias2 = new HashSet<>();

            for (String letra : conjunto1) {
                int contador = 0;
                for(int i = 0; i < p1.length(); i++){
                    if(letra.equals(aux1[i])){
                        contador++;
                    }
                }
                coincidencias1.add(contador);
            }

            for (String letra : conjunto2) {
                int contador = 0;
                for(int i = 0; i < p2.length(); i++){
                    if(letra.equals(aux2[i])){
                        contador++;
                    }
                }
                coincidencias2.add(contador);
            }

            if(coincidencias1.equals(coincidencias2)){
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }
    }
    
}
