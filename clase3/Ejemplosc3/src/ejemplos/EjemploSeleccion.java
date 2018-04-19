/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
Crear un programa que permita ingresar una calificación por teclado, si la calificación ingresada es mayor o igual a 5 y la calificación es menor a 10
se debe presentar un mensaje que diga usted está en supletorios.
De lo contrario se presenta un mensaje con el valor d ela calificación dividio para dos.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EjemploSeleccion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion;
        System.out.println("Ingrese su calificacion");
        calificacion = entrada.nextDouble();

        //python se usa "and"
        if (calificacion >= 5 && calificacion < 10) {
            System.out.printf("Usted esta en supletorio");
        } else {
            double resultado= calificacion/2;
            System.out.printf("%f", resultado);
        }
    }
}
