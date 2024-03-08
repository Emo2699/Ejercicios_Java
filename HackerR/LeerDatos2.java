/**
 * @Description:    Al momento de leer datos del STDIN con la clase Scanner
 * cuando se usa los metodos nextInt() o nextDouble() el caracter retorno de carro "\n"
 * queda en buffer.
 * 
 * Entonces al momento de querer leer una cadena desde el STDIN despues de estos metodos, la variable
 * que guardara dicha entrada tendra el valor del retorno de carro
 * 
 * Existen dos formas de resolver esto.
 * 
 * 1. Usar despues del metodo nextInt() o nextDouble() un nextLine() para leer el retorno de carro
 * en buffer y usar un segundo nextLine() para leer lo que pueda escribir el usuario desde el teclado
 * 
 * 2. Castear la entrada de String a int o double (segun sea necesario) con el metodo parse() pasandole
 * como argumento lo que se leea del STDIN
 * 
 * En este ejemplo se muestra la segunda opcion.
 */


import java.util.Scanner;

public class LeerDatos2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your code here.
        
        //Leer un entero
        // int i = scan.nextInt();
        int i = Integer.parseInt(scan.nextLine(),10);
        String s = scan.nextLine();
        
        double d = scan.nextDouble();
        
        //s = scan.nextLine();
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
