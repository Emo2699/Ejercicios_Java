/*
 * En este problema se obtiene el dia de la semana a partir de una fecha dada
 * Aqui se usan las clases LocalDate y DayOfWeek para obtener el resultado deseado
 * 
 * Problema de HackerRank: Java Date and Time
 * 
 * 
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Fecha1 {


    public class Result{


        public static String findDay(int month, int day, int year) throws Exception{
            if(2000 < year && year> 3000){
                Exception ex = new Exception("Year incorrect");
                throw ex;
            }else{
                //El day debe de ir 0 a 30 representando el dia del mes
                LocalDate fecha = LocalDate.of(year, month, day);

                DayOfWeek diaSemana = fecha.getDayOfWeek();

                return diaSemana.toString();
                
            }

        }
    }


    public static void main(String[] args) throws IOException{
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //Separo la cadena de entrada por cada espacio encontrado y la separacion lo guardo en un arreglo de String
        //Ademas, remplazo el ultimo espacio en blanco de la cadena por cadena vacia.
        String [] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$","").split(" ");

        //Guardo en variables de tipo int cada uno de los elementos del arreglo.
        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        
        try {
            //Mando a llamar a mi funcion para obtener el dia de la semana 
            String res = Result.findDay(month, day,year);
            System.out.println(res);
            //bufferedWriter.write(res);
            //bufferedWriter.newLine();

            bufferedReader.close();
            //bufferedWriter.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
