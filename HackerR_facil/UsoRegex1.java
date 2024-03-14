/**
 * Este problema consiste en separar en un arreglo de cadenas todas las cadenas que coincidan con
 * cierto patron.
 * 
 * Aqui se usa el metodo split(String regex) el cual devuelve un arreglo de String, pero 
 * deja en el arreglo las parte de la cadena que no coincidieron con regex
 * 
 * El patron solicitado en este problema fue [\\s!,?._'@]+ donde \\s se refiere a los
 * espacios
 * 
 * Fuente: HackerRank Java String Tokens
 * Nota: En algunos ejemplos de prueba del HR se usa cadenas con puro espacio
 * Ej
 * STDIN:"             " (obvio sin las comillas)
 * 
 * Esa cadena debe de arrojar 0 porque son puros espacios 
 */


// import java.util.Arrays;
// import java.util.List;
import java.util.Scanner;

public class UsoRegex1 {
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     String s = scan.nextLine();
    //     // Write your code here.
    //     s = s.trim();
    //     String[] tokens = s.split("[\\s!,?._'@]+");

    //     if(tokens.length == 1){
    //         if(tokens[0].equals("")){
    //             System.out.println(0);
    //         }
    //     }else{
    //         System.out.println(tokens.length);
        

    //         // List<String> lista = Arrays.asList(tokens);
    //         // System.out.println(lista);
    //         for(int i = 0; i < tokens.length; i++){
    //             if (tokens[i].equals("")) {
    //                 System.out.println("vacia");
    //             }else{
    //                 System.out.println(tokens[i]);
    //             }
    //         }
    //     }
        
    //     scan.close();
    // }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            
            String[] tokens = s.split("[ !,?._'@]+");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
    
}
