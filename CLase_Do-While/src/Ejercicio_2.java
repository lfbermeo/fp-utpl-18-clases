
import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declarar variables e inicializarlas 
        String reporte_final, nom_jugador;
        int num_partidos = 0, sum, prome, cant_juga = 0, cont_1 = 0, promedio_pases = 0, promedio_goles = 0, suma_pases = 0, suma_goles = 0;
        //Cadena para que imprima el título
        reporte_final = String.format("%s\n", "Reporte de jugadores del equito UTPL");
        //Datos que se le pedirá al usuario
        System.out.printf("%s", "Ingrese porfavor el numero de jugadores que desea ingresar:\n");
        cant_juga = entrada.nextInt();
        int cont;
        //Con el ciclo do while, si la condición se cumple ingresará a lo que se enecuetra dentro 
        do {
            suma_goles = 0;
            suma_pases = 0;
            //Con este for vamos a pedir la cantidad de jugadores  y su nombre, para que vaya repitiendo dependiendo de lo que pide el usuario
            for (cont = 1; cont <= cant_juga; cont++) {
                //Datos por teclado
                System.out.println("¿Cuál es el nombre del jugador?");
                nom_jugador = entrada.next();
                System.out.println("¿Cuantos partidos jugo:?");
                num_partidos = entrada.nextInt();
                //En está cadena imprimiremos el encabezado del reporte
                reporte_final = String.format("%s%s\t\t\t%s\t\t\t%s\t\t%s\n", reporte_final, "NOMBRE DEL JUGADOR", "TOTAL PASES", "TOTAL GOLES", "NIVEL JUGADOR");
                //En está cadena apartamos el nombre del jugador, ya que solo requerimos que se imprima una sola vez
                reporte_final = String.format("%s%s", reporte_final, nom_jugador);
                //Limpiamos 
                entrada.nextLine();
                int num_pase = 0, num_goles = 0;
                int total_pases = 0, total_goles = 0;
                //Con este for vamos a ir pediendo al usuario los datos del partido, para qeu vaya repitiendo dependiendo de lo que pida el usuario
                for (int cont_2 = 1; cont_2 <= num_partidos; cont_2++) {
                    //Datos por teclado
                    System.out.printf("\n%s\n", "DATOS DEL JUGADOR\n");
                    System.out.printf("%s%d", "P:", cont_2);
                    System.out.println("¿Cuántos pases realizado en el partido");
                    num_pase = entrada.nextInt();
                    System.out.printf("%s%d", "P:", cont_2);
                    System.out.println("¿Cuántos goles realizado en el partido");
                    num_goles = entrada.nextInt();
                    entrada.nextLine();
                    //Aquí calcularemos el total de cada uno de los jugadores tanto en pases como en goles
                    total_pases = total_pases + num_pase;
                    total_goles = total_goles + num_goles;
                    //En está cadena imprimiremos el tanto de goles y pases que incluyó el usuario
                    reporte_final = String.format("%s\t\t\t\t\t%s%d%s%d\t\t\t\t%s%d%s%d\n", reporte_final, "P", cont_2, ":", num_pase, "P", cont_2, ":", num_goles);

                }
                //Estas operaciones son para sacar el promedio de pases y goles
                suma_pases = suma_pases + total_pases;
                suma_goles = suma_goles + total_goles;

                reporte_final = String.format("\n\t%s\t\t\t\t\t%s%d\t\t\t%s%d", reporte_final, "Total: ", total_pases, "Total: ", total_goles);
                //Con estos if anidados  vamos a comparar su total de pases, para que lo pueda calificar
                if (total_pases == 100) {
                    reporte_final = String.format("%s\t\t%s\n", reporte_final, "Sobresaliente");
                } else {
                    if (total_pases <= 99 && total_pases >=80) {
                        reporte_final = String.format("%s\t\t%s\n", reporte_final, "Muy bueno");
                    } else {
                        if (total_pases <= 79 && total_pases >= 60) {
                            reporte_final = String.format("%s\t\t%s\n", reporte_final, "Bueno");
                        } else {
                            if (total_pases <= 59 && total_pases >=0) {
                                reporte_final = String.format("%s\t\t%s\n", reporte_final, "Regular");
                            }
                        }
                    }

                }

            }
        } while (cont <= cant_juga);
        //Impresión de la cadena final
        System.out.println(reporte_final);
        //Impresión del promedio de pases y goles global y las operaciones 
        System.out.printf("El promedio de pases es : %d\n", promedio_pases = suma_pases / cant_juga);
        System.out.printf("El promedio de goles es: %d\n", promedio_goles = suma_goles / cant_juga);

    }
}
