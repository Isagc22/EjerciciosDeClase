// Escribir un programa que permita determinar la cantidad total a pagar por una llamada telefónica de N minutos
// (introducido por el usuario), teniendo en cuenta lo siguiente:
// • Las llamadas de 5 minutos o menos tienen un coste de 10 BsF.
// • Cada minuto adicional a partir de los 5 primeros cuesta 2 BsF. 
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuánto tiempo duró la llamada en minutos?: ");
        int minutos = scanner.nextInt();
        
        int costo = 10;
        
        if (minutos > 5) {
            int minutosAdicionales = minutos - 5;  
            costo += minutosAdicionales * 2;  
        
        System.out.println("El costo total de la llamada es: " + costo + " BsF");
        
        scanner.close();
    }
}
}