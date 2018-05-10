

import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        String cadena_final;
        int suma=0;
        int edad;
        int contador = 1;
        cadena_final = String.format("%s\t%s\n","Edad", "Suma");
        while ( contador <=5){
            System.out.println("Ingrese el valor de edad");
            edad = entrada.nextInt();
            suma = suma+ edad ;
            cadena_final = String.format("%s%d\t%d\n",cadena_final, edad,suma);
            contador = contador +1; 
            
        }        
                System.out.printf("%s",cadena_final);
               
    }
}
