/**
 * Author:          Ramirez Morales Erick Hazel
 * Date:            15/03/23
 * Description:     Archivo dedicado a la resolucion de los problemas propuestos de la lista de ejercicios.
 * 
 * nota:            El archivo se trabajo con la version del JDK 19.0.2
 *                  Para compilar el archivo se hace con de la siguiente forma.
 *                      $javac nombre_archivo.java
 *                  Para ejecutar el archivo compilado se hace de la siguiente forma.
 *                      $java nombre_archivo
 */

public class Ejercicios {
        
    // Programa Main
    public static void main(String[] args) {
        //problema1("hola");

        /*************************************************************/
        //problema2("Ahora yo solo quiero comer",30);

        /*************************************************************/
        //problema3("Hola que tal", "ho");
        
        /*************************************************************/
        //problema5("hola que tal, como estas???");
        
        /*************************************************************/
        //System.out.println(problema11(10));

        /*************************************************************/
        //problema12(26);

        /*************************************************************/
        // problema13(26);
        // problema13(5);

        /*************************************************************/
        //problema16(1500,30);

        /*************************************************************/
        // int numeros[] = {6,5,3,1,8,7,2,4};
        // imprimirArregloInt(numeros);
        // problema24(numeros, 0, numeros.length-1);
        
        // System.out.println("Arreglo ordenado");
        // imprimirArregloInt(numeros);

        /*************************************************************/

    }//fin programa Main

    /*      FUNCIONES AUXILIARES        */
    static void imprimirArregloInt(int enteros[]){
        for(int n:enteros){
            System.out.print(n+" ");
        }
        System.out.println();
    }//fin imprimirArregloInt();

    static void imprimirArregloString(String cadenas[]){
        for(String n:cadenas){
            System.out.print(n+" ");
        }
        System.out.println();
    }//fin imprimirArregloString();


    static void imprimirArregloFloat(float flotantes[]){
        for(float n:flotantes){
            System.out.print(n+" ");
        }
        System.out.println();
    }//fin imprimirArregloFloat();


    /*      FUNCIONES PARA DAR SOLUCION A LOS PROBLEMAS       */
    /*      PROBLEMA 1      */
    public static void problema1(String cadena){
        //Forma 1 de resolver el ejercicio, usando la propiedad length de la Clase String
        System.out.println("El numero de caracteres de la cadena ingresada es: "+cadena.length());
    }//fin problema1()


    /*      PROBLEMA 2      */
    public static void problema2(String cadena, int corte){
        //Una validacion que hay que hacer es que el entero corte no sea mayor que la cadena ya que seria imposible partirla
        if(corte > cadena.length()){
            System.out.println("El numero ingresado para cortar la cadena es mayor que la longuitud total de la cadena, por lo que no se puede cortar -_-");
            return;
        }

        System.out.println(cadena.substring(0, corte));
    }//fin problema2()

    /*      PROBLEMA 3      */
    public static void problema3(String cadena, String caracteres){
        
        /*
         * NOTA: El metodo split() solo funciona con un solo carcater
        */
        //Inicializamos nuestro arreglo de strings
        String[] resultado;
        resultado = cadena.split(caracteres);
        for(String elemento : resultado){
            System.out.println(elemento);
        }
    } //fin problema3();

    /*      PROBLEMA 5      */
    public static void problema5(String cadena){
        char aux[] = cadena.toCharArray();
        String resultado = "";

        for(int i = aux.length-1; i > -1; i--){
            resultado+= aux[i];
        }
        System.out.println(resultado);


    }//fin problema5();

    /*      PROBLEMA 11     */
    public static int problema11(int numero){
        if(numero == 1){
            return 1;
        }
        else{
            return numero * problema11(numero-1);
        }
    }//fin problema11();

    /*      PROBLEMA 12     */
    public static void problema12(int numero){
        if(numero < 0){
            System.out.println("El numero debe de ser Positivo -_-");
            return;
        }
        
        if(numero == 1){
            System.out.println("El 1 no se considera PRIMO o NO PRIMO :v");
            return;
        }
        
        if(numero == 2){
            System.out.println("El numero es Primo");
            return;
        }
        int aux = 2,bandera = 0;
        while(aux< numero){
            if(numero%aux == 0){
                bandera = 1;
                break;
            }
            aux++;
        }
        String resultado = (bandera == 0)?"ES PRIMO":"NO ES PRIMO";
        System.out.println(resultado);
        
    }//fin problema12();

    /*      PROBLEMA 13     */
    public static void problema13(int numero){
        String mensaje = (numero%2 == 0)?"EL NUMERO ES PAR":"EL NUMERO ES IMPAR";
        System.out.println(mensaje);
    }//fin problema13()


    /*      PROBLEMA 16     */
    public static void problema16(int cantidad, int porcentaje){
        int descuento = (cantidad * porcentaje)/100;
        System.out.println("El monto final es: "+ (cantidad - descuento));
    }//fin problema16()

    /*      PROBLEMA 24     ORDENAMIENTO QUICK SORT*/
    //Ubicacion del pivote de menor a mayor
    public static int ubicarPivote(int numeros[],int inicio, int fin){
        int aux;
        while(inicio < fin){
            //Recorrido desde la derecha hacia la izquierda
            while(numeros[inicio] <= numeros[fin] && inicio<fin){
                fin--;
            }
            //Primer cambio
            aux = numeros[inicio];
            numeros[inicio] = numeros[fin];
            numeros[fin] = aux;

            //Recorrido de izquierda a derecha
            while(numeros[fin] >= numeros[inicio] && inicio < fin){
                inicio ++;
            }

            //Segundo cambio
            aux = numeros[inicio];
            numeros[inicio] = numeros[fin];
            numeros[fin] = aux;
        }
        return inicio;
    }//fin ubicarPivote();

    public static void problema24(int numeros[],int inicio, int fin){
        if((fin - inicio) > 1){
            int pivote = ubicarPivote(numeros, inicio, fin);
            //ordenamiento por la izquierda
            problema24(numeros, inicio, pivote-1);
            //ordenamiento por la derecha
            problema24(numeros, pivote+1,fin);
        }

    }//fin problema24();


}


