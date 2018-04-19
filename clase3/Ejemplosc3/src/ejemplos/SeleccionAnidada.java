/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        // documentacion
         Scanner entrada = new Scanner(System.in);

        int calificacion=75;
        String nombre = "Luisa";
        System.out.println(nombre.toUpperCase());
       
        if (calificacion >= 90) {
            System.out.printf("está aprobado /n (excelente) con %d\n",calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("está aprobado /n (muy buena) con %d\n",calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("está aprobado /n (regular) con %d\n", calificacion);

                } else {
                    System.out.printf("está reprobado n/ con %d\n", calificacion);  

                }
            }
        }
    }
}
