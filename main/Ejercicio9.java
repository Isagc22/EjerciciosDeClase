// Dada la fecha de hoy, calcular la fecha del día siguiente. Suponer que el año no es bisiesto. 

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el día: ");
        int dia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresa el mes: ");
        int mes = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresa el año: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        int diaFinal = dia + 1;

        if(diaFinal < 31 && mes < 12){
        System.out.println("La fecha de mañana es: " + diaFinal + "/" + mes + "/" + year);
        }else{
            System.err.println("Intenta de nuevo");
        }
        scanner.close();
    }

}
