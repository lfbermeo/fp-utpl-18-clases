
import java.util.Scanner;

public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        double suma_total = 0;
        double promedio_final = 0 ;
        boolean bandera = true;
        System.out.println("Ingrese las notas de los estudiantes de su materia");
        while (bandera) {
            System.out.printf("Ingrese calificación número %d\n", contador);
            int valor = entrada.nextInt();
            double valor_real = (double) valor;
            suma_total = suma_total + valor_real;
            contador = contador + 1;

            entrada.nextLine(); // Ojo usamos el limpiador del scanner.
            // proceso para salir del ciclo.

            System.out.println("Ingrese si(salir)");
            String temporal = entrada.nextLine();
            if (temporal.equals("si")) {
                bandera = false;
            }
        }
        promedio_final = suma_total / contador;
        System.out.printf("El promedio final es %.2f\n", promedio_final);

    }
}
