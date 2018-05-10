
import java.util.Scanner;

public class Ejercicios_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     String reporte_final;
     double estatura;
     int contador = 0;
     double suma = 0;
     double promedio;
     boolean valor = true;
     reporte_final = String.format("%s\n", "Estatura");
     while (valor){
         System.out.printf("Ingrese la estaura de los estudiantes para el equipo de basquet %d\n", contador);
         estatura = entrada.nextDouble();
         double estatura_mini = 1.20;
         if (estatura < estatura_mini){
         estatura = estatura_mini;
         }
         suma = suma+ estatura;
         reporte_final = String.format("%s %.2f\n",reporte_final,estatura);
         contador = contador + 1;
         
         entrada.nextLine();
         
         System.out.println("Ingrese si(salir)");
            String temporal = entrada.nextLine();
            if (temporal.equals("si")) {
                valor = false;
            }
         
     }
      promedio = suma / contador;
        System.out.println("Reporte de estaturas: ");
        System.out.printf("%s", reporte_final);
        System.out.println("");
        System.out.printf("El promedio de estturas es: %.2f\n ", promedio);
        System.out.println("");
        System.out.println("Reporte generado por el Dep. Deportes");
        
    }
}
