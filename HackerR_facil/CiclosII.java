/**
 * Problema que arma la siguiente serie
 * (a + 2^0 * b) + (a + 2^1 * b) +...+ (a + 2^n-1 * b)
 * 
 * El problema esta en HackerRank con el nombre Java Loops II
 */

import java.util.Scanner;

public class CiclosII {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        //Numero de veces que se hara la serie
        int t = in.nextInt();

        int[] a = new int[t];
        int[] b = new int[t];
        int[] n = new int[t];


        for(int i = 0; i < t; i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            n[i] = in.nextInt();
        }

        in.close();

        for(int i = 0; i < t; i++){
            //Creamos un arreglo donde almacenaremos los resultados de la serie
            //uno por cada vuelta de t
            int[] resultados = new int[n[i]];
            int aux = 0;
            
            //Creamos un nuevo ciclo el cual obtendrá los resultados de la serie
            for(int j = 0; j < n[i]; j++){
                aux += Math.pow(2, j)*b[i];
                resultados[j] = a[i] + aux;
            }

            for(int resultado: resultados){
                System.out.printf("%d ",resultado);
            }
            System.out.println();

        }
    }
}
