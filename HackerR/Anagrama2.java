/**
 * Ejercicio para determinar si dos cadenas son anagramas
 * 
 * Fuente: HackerRank Java Anagrams
 * 
 * NOTA: En la pagina de HackerRank el codigo proporcionado es la bilioteca java.util.Scanner y
 * el metodo main, NO SE PUEDE MODIFICAR NADA DE ESE CODIGO. En la pagina viene el metodo isAnagram()
 * vacio para que el usuario lo implemente.
 * 
 * En la pagina SI permite agregar mas metodos como en el codigo de este archivo.
 * 
 * Esta es una forma de resolver el problema usando unnicamente metodos de la clase String
 * y arreglos de String. Existen más formas de resolver el problema usando más cosas de Java.
 * 
 * Esta version es la que funciona en la pagina de HR al utilizar su editor de codigo en la web.
 */

import java.util.Scanner;

public class Anagrama2 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String entrada1 = scan.next();
        String entrada2 = scan.next();

        scan.close();
        boolean ret = isAnagram(entrada1, entrada2);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }




    /*Funcion que regresa una cadena con todas las letras dentro de la String pasada como 
     * argumento.
    */
    public static String hacerConjunto(String cadena){
        String[] letras = cadena.split("");
        String conjunto = "";
        for(String letra: letras){
            if(!conjunto.contains(letra)){
                conjunto+=letra;
            }
        }
        return conjunto;
    }
    
    /*Funcion que compara las letras de dos cadenas,
     * Si ambas cadenas tienen las mismas letras, regresara True
     * Si las cadenas no tienen las mismas letras regresara False
    */
    public static boolean compararLetras(String cadena1, String cadena2){
        
        if(cadena1.length()!= cadena2.length()){
            return false;
        }else{
            String[] aux = cadena1.split("");
            for(String letra: aux){
                if (!cadena2.contains(letra)) {
                    return false;
                }
            }
            return true;
        }
        
        
    }

    /**
     * 
     * Metodo que devuelve el numero de ocurrencias (repeticiones) de una cadena en otra
     * OJO, En este metodo se asume que el parametro "letra" es de longuitud 1 debido
     * a que representa la letra a buscar su numero de ocurrencias en el parametro "palabra"
     * @param letra
     * @param palabra
     * @return -1 si letra tiene longuitud > 1, int correspondiente al numero de ocurrencias
     */

    public static int contarRepeticiones(String letra, String palabra){
        if(letra.length()>1){
            return -1;
        }
        
        //Pongo en arreglo de String las letras de la cadena recibida como parametro
        String[] letras = palabra.split("");
        int contador = 0;

        for(String letter: letras){
            if(letra.equals(letter)){
                contador++;
            }
        }
        return contador;
    }

    
    public static boolean verificarRepeticiones(String letra, String[] conjunto1, String[] conjunto2){
        int indice1 = 0, indice2 = 0;

        for(int i = 0; i < conjunto1.length; i++){
            if(letra.equals(conjunto1[i])){
                indice1 = i;
                break;
            }
        }

        for(int i = 0; i < conjunto2.length; i++){
            if(letra.equals(conjunto2[i])){
                indice2 = i;
                break;
            }
        }

        if(conjunto1[indice1+1].equals(conjunto2[indice2+1])){
            return true;
        }else{
            return false;
        }

    }

    public static boolean isAnagram(String entrada1, String entrada2){
        //Obtengo las letras sin repeticion de cada palabra
        //Y las pongo en una nueva cadena
        String letras1 = hacerConjunto(entrada1.toLowerCase());
        String letras2 = hacerConjunto(entrada2.toLowerCase());

        // System.out.println(letras1);
        // System.out.println(letras2);

        //Comparo si ambas cadenas tienen las mismas letras, no importa el orden.
        System.out.println(compararLetras(letras1, letras2));

        if(compararLetras(letras1, letras2)){
            //Arreglos donde guardare cada letra y sus ocurrencias en cada palabra
            String[] vecesConjunto1 = new String[letras1.length() * 2];
            String[] vecesConjunto2 = new String[letras2.length() * 2];
            int j = 0;

            //Separo en un arreglo de cadenas las letras de los conjuntos
            String[] conjunto1 = letras1.split("");
            String[] conjunto2 = letras2.split("");

            for(int i = 0; i < vecesConjunto1.length; i++){
                vecesConjunto1[i] = conjunto1[j];
                i++;
                vecesConjunto1[i] = Integer.toString(contarRepeticiones(conjunto1[j],entrada1.toLowerCase()));
                j++;
            }
            j = 0;
            for(int i = 0; i < vecesConjunto2.length; i++){
                vecesConjunto2[i] = conjunto2[j];
                i++;
                vecesConjunto2[i] = Integer.toString(contarRepeticiones(conjunto2[j],entrada2.toLowerCase()));
                j++;
            }

            //Imprimo los arreglos con sus repeticiones
            // for(String aux: vecesConjunto1){
            //     System.out.printf("%s,",aux);
            // }
            // System.out.println();
            // for(String aux: vecesConjunto2){
            //     System.out.printf("%s,",aux);
            // }
            // System.out.println();

            for(String aux: conjunto1){
                if(!verificarRepeticiones(aux, vecesConjunto1, vecesConjunto2)){
                    return false;
                }
            }
            return true;

            
        }else{
            // System.out.println("No Anagrams");
            return false;
        }
    }

}
