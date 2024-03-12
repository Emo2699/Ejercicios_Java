/**
 * Ejercicio básico de palindromo en cadenas
 * Fuente: Java String Reverse de HackerRank
 */

import java.util.Scanner;

public class Palindromo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        sc.close();

        //System.out.println(A);

        //palindromoV1(A);
        palindromoV2(A);
    }

    /*
     * Forma 1 de resolver el problema del palindromo
     * cambiar la palabra original a un arreglo de char, 
     * crear una cadena aux, recorrer al reves el arreglo
     * y guardar en aux cada uno de los caracteres.
     * 
     * finalmente se compara la cadena original con aux con el
     * metodo equals()
    */

    public static void palindromoV1(String palabra){
        char[] letras = palabra.toCharArray();
        String aux = "";
        for(int i =  palabra.length()-1; i >= 0; i--){
            //System.out.printf("%c\n",letras[i]);
            aux+=letras[i];
        }
        //System.out.println(aux);

        if(palabra.equals(aux)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    /*
     * En esta funcion nos apoyamos de la clase StringBuffer para
     * revertir la cadena que el usuario ingresa. y con el metodo
     * equals se hace la comparacion.
     * 
     * Puntos fuertes: Menos codigo en esta version y presentacion más 
     * limpia.
     * 
    */

    public static void palindromoV2(String palabra){
        StringBuffer buffer = new StringBuffer(palabra);
        if(palabra.equals(buffer.reverse().toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
