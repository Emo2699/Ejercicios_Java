/**
 * En este problema se solicita contar cuantas sumatorias son negativas en cada
 * uno de los subarreglos de un arreglo original.
 * 
 * Fuente: HR Java Subarray. 
 * 
 * Suponiendo un arreglo de tamaño 10
 * todos los subarreglos a verificar son los siguientes
Arreglo en los indices 0 - 0 
Arreglo en los indices 0 - 1 
Arreglo en los indices 0 - 2 
Arreglo en los indices 0 - 3 
Arreglo en los indices 0 - 4 
Arreglo en los indices 0 - 5 
Arreglo en los indices 0 - 6 
Arreglo en los indices 0 - 7 
Arreglo en los indices 0 - 8 
Arreglo en los indices 0 - 9 

Arreglo en los indices 1 - 1
Arreglo en los indices 1 - 2
Arreglo en los indices 1 - 3
Arreglo en los indices 1 - 4
Arreglo en los indices 1 - 5
Arreglo en los indices 1 - 6
Arreglo en los indices 1 - 7
Arreglo en los indices 1 - 8
Arreglo en los indices 1 - 9


Arreglo en los indices 2 - 2
Arreglo en los indices 2 - 3
Arreglo en los indices 2 - 4
Arreglo en los indices 2 - 5
Arreglo en los indices 2 - 6
Arreglo en los indices 2 - 7
Arreglo en los indices 2 - 8
Arreglo en los indices 2 - 9

Arreglo en los indices 3 - 3
Arreglo en los indices 3 - 4
Arreglo en los indices 3 - 5
Arreglo en los indices 3 - 6
Arreglo en los indices 3 - 7
Arreglo en los indices 3 - 8
Arreglo en los indices 3 - 9

Arreglo en los indices 4 - 4
Arreglo en los indices 4 - 5
Arreglo en los indices 4 - 6
Arreglo en los indices 4 - 7
Arreglo en los indices 4 - 8
Arreglo en los indices 4 - 9

Arreglo en los indices 5 - 5
Arreglo en los indices 5 - 6
Arreglo en los indices 5 - 7
Arreglo en los indices 5 - 8
Arreglo en los indices 5 - 9

Arreglo en los indices 6 - 6
Arreglo en los indices 6 - 7
Arreglo en los indices 6 - 8
Arreglo en los indices 6 - 9

Arreglo en los indices 7 - 7
Arreglo en los indices 7 - 8
Arreglo en los indices 7 - 9

Arreglo en los indices 8 - 8
Arreglo en los indices 8 - 9

Arreglo en los indices 9 - 9
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NegativosEnArreglo {
    public static void main(String[] args) throws IOException{
        //int[] numeros = {1,-2,4,-5,1};
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        int tam = Integer.parseInt(teclado.readLine());

        String[] numeros = teclado.readLine().split(" ");

        teclado.close();

        int[] A = new int[tam];
        for(int i = 0; i < tam; i++)
            A[i] = Integer.parseInt(numeros[i]);
            
        int conteo = 0;
        for(int i = 0; i < A.length; i++){
            int sumatoria = 0;
            for(int j = i; j < A.length; j++){
                sumatoria+=A[j];
                if(sumatoria < 0){
                    conteo++;
                }
            }
        }
        System.out.println(conteo);
    }    
}
