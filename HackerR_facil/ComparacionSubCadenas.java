/**
 * Problema de comparacion de sub cadenas
 * Fuente: HackerRank Java Substring Comparisons
 * 
 * El problema establece que se recibe por STDIN dos entradas
 * s = una cadena cualquiera
 * k = tamaño de subcadenas
 * 
 * Aqui hay que comparar todas las subcadenas de S con tamaño K
 * y devolver la primera y ultima si todas las subcadenas fueran ordenadas
 * alfabeticamente.
 * 
 * Nota: Este problema no saca todas las combinaciones de caracteres de la cadena S.
 * no confundir con combinatoria todas las subcadenas de una cadena 
 */


import java.util.Scanner;

public class ComparacionSubCadenas {


    public static String getSmallestAndLargest(String s, int k){
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        int i = 1;
        k+=1;

        while (k<= s.length()) {
            String aux = s.substring(i, k);
            // System.out.println(aux);
            //Comparacion lexicografica
            if(aux.compareTo(smallest)<0){
                smallest = aux;
            }
            if(aux.compareTo(largest)>0){
                largest = aux;
            }
            i++;
            k++;
        }
        return smallest + "\n" + largest;


    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));

    }
    
}
