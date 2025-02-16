// Escribir un programa que permita determinar la cantidad total a pagar por una llamada telefónica de N minutos
// (introducido por el usuario), teniendo en cuenta lo siguiente:
// • Las llamadas de 5 minutos o menos tienen un coste de 10 BsF.
// • Cada minuto adicional a partir de los 5 primeros cuesta 2 BsF. 

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuanto tiempo duro la llamada: ");
        int minuto = scanner.nextInt();

        if(minuto <= 5){
            System.err.println("Su llamada tienes un costo de: 10 BsF");
        }else{
            System.err.println("Su llamada se paso");
        }

        scanner.close();
    }
}
