/**
 * Este es un problema donde se solicita usar el Static Initializer Block
 * (Bloque inicializador estatico).
 * En este problema dicho bloque se usó para inicializar variables estaticas
 * y despues usarlas en una funcion.
 * 
 * El bloque estatico solo puede hacer uso o referencia a variables o metodos
 * estaticos dentro de su clase.
 * 
 * Los bloques estaticos se ejecutaran conforme al orden en como esten dentro del
 * codigo fuente.
 * 
 * Problema de HackerRank: Java Static Initializer Block
 * videos de referencia: 
 *  https://www.youtube.com/watch?v=-xC0o6JQaoE, 
 *  https://www.youtube.com/watch?v=SchNZnVoSIM
 */


import java.util.Scanner;

public class BloqueEstatico {
    //Variables estaticas
    public static int B;
    public static int H;

    static {
        Scanner entrada = new Scanner(System.in);
        B = entrada.nextInt();
        H = entrada.nextInt();
        entrada.close();
    }

    public static void main(String[] args) {
        try{
            calcularArea(B, H);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }

    //Metodo de calcular el Area
    public static void calcularArea(int b, int h)throws Exception{
        if(b < 0 || h < 0 || b >=100 || h >= 100){
            
            Exception ex = new Exception("Breadth and height must be positive");
            throw ex;
        }
        System.out.println(b*h);
    }
}
