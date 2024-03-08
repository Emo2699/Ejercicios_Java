/**
 * @Description: Prolema que solicita una salida formateada
 * Es necesario usar la funcion prinf()
 * 
 * la entrada viene con el siguiente formato
 *      palabra numero
 * 
 * Salida esperada
 *      palabra    numero
 *      palabra    numero
 *      palabra    numero
 * 
 * Consideraciones:
 *  El espacio para las palabras es de 15 caracteres en total, por lo que de 1 a 15 
 *  puede caber la palabra ingresada
 *  
 *  a partir del caracter 16 viene el numero. si el numero tiene longuitud menor a 3
 *  agregar 0 para completar los 3 digitos
 * 
 * para garantizar que SOLO se reserven 15 espacios de caracter para una cadena se usa %nEspacioSs
 * donde "nEspacioS" es la cantidad que se desea para dicha cadena
 */

import java.util.Scanner;

public class FormatoSalida {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        int[] numeros = new int[3];
        String[] palabras = new String[3];

        for(int i = 0; i < 3; i++){
            //Leo 3 veces del STDIN
            String s1 = sc.next();
            int x=sc.nextInt();
            numeros[i] = x;
            palabras[i] = s1;

            
        }
        sc.close();
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            if(Integer.toString(numeros[i]).length() == 1){
                System.out.printf("%-15s00%d\n",palabras[i],numeros[i]);
            }else if(Integer.toString(numeros[i]).length() == 2){
                System.out.printf("%-15s0%d\n",palabras[i],numeros[i]);
            }else{
                System.out.printf("%-15s%d\n",palabras[i],numeros[i]); 
            }
        }
        System.out.println("================================");

    }
    
}
