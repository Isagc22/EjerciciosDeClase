// Solicitar al usuario una fecha (dd:mm:aaaa) y comprobar si es correcta. Para que una fecha sea correcta es
// necesario:
// • El año debe ser mayor que cero.
// • El mes debe estar entre 1 y 12.
// • Dependiendo del mes que sea, el día debe estar dentro de los límites válidos. Los meses que tienen 31 días
// son 1, 3, 5, 7, 8, 10 y 12. Los meses de 30 días son 4, 6, 9 y 11. El mes de 28 días es 2, excepto en un año
// bisiesto que es 29 días. 

import java.util.Scanner;

public class Ejercicio12 {

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


        
        scanner.close();
    }
}
