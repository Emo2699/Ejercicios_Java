/*
 * En este problema piden hacer varias operaciones sobre cadenas
 * LAS CADENAS PROVIENEN DESDE LA ENTRADA ESTANDAR
 *  Se reciben dos cadenas A,B.
 * 1. Imprimir la suma de las longuitudes de las cadenas dadas
 * 2. Imprimir si la cadena B va antes de A alfabeticamente.
 * 3. Imprimir ambas cadenas en una sola linea modificando a mayuscula la primera letra 
 *    de cada cadena.
 * 
 * 
 * ref: Problema de HackerRank. "Java String Introducction"
 * 
 * 
 * Funcion de ayuda
 * comparesTo(String palabra)
 * 
 * La funcion de arriba ayuda a comparar alfabeticamente dos cadenas devolviendo un entero.
 * El entero negativo si el argumento "palabra" va despues del objeto String que usa la funcion
 * El entero es positivo si el argumento "palabra" va antes del objeto String que usa la funcion
 * El entero es 0 si el argumento y el objeto String que usa el metodo son iguales 
*/

import java.util.Scanner;

public class Cadenas1 {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //Hello
        String B=sc.next(); //Java
        /* Enter your code here. Print output to STDOUT. */

        sc.close();
        
        System.out.println(A.length() + B.length());
        //System.out.println(A.compareTo(B)); //Menor a 0 si A va antes de B  
        //System.out.println(B.compareTo(A)); //Mayor a 0 si B va despues de A
        //System.out.println(B.compareTo(B)); //0 si son iguales

        if(B.compareTo(A)>0 || B.compareTo(A)==0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

        String letrasAMayuscula = A.substring(0, 1).toUpperCase();
        String letrasBMayuscula = B.substring(0, 1).toUpperCase();
        
        System.out.printf("%s%s %s%s\n",letrasAMayuscula,A.substring(1),letrasBMayuscula,B.substring(1));
        System.out.printf("%s %s", cambiarPrimerLetra(A), cambiarPrimerLetra(B));   
    }

    public static String cambiarPrimerLetra(String palabra){
        if(palabra.length() == 1){
            return palabra.toUpperCase();
        }else{
            String letraCapital = palabra.substring(0, 1).toUpperCase();
            return letraCapital.concat(palabra.substring(1));
        }
    }
}
