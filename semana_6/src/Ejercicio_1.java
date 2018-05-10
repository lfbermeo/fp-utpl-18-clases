

public class Ejercicio_1 {
    public static void main(String[] args) {
        int suma = 0;
        int contador = 1;
        System.out.printf("%s\t %s\n", "Contador","Suma");
        while ( contador <=4){
            suma = suma + contador;
            System.out.printf("%d\t\t%d\n",contador,suma);
            contador = contador + 1;
            
        }
    }
}
