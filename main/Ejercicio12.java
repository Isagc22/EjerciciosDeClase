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

        System.out.print("Ingresa el día (dd): ");
        int dia = scanner.nextInt();
        
        System.out.print("Ingresa el mes (mm): ");
        int mes = scanner.nextInt();
        
        System.out.print("Ingresa el año (aaaa): ");
        int año = scanner.nextInt();
        
        if (año <= 0) {
            System.out.println("El año debe ser mayor que 0.");
        } else if (mes < 1 || mes > 12) {
            System.out.println("El mes debe estar entre 1 y 12.");
        } else {
            boolean esBisiesto = (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0));  // Comprobar si el año es bisiesto

            boolean fechaValida = false;
            
            switch (mes) {
                case 1: // Enero
                case 3: // Marzo
                case 5: // Mayo
                case 7: // Julio
                case 8: // Agosto
                case 10: // Octubre
                case 12: // Diciembre
                    if (dia >= 1 && dia <= 31) {
                        fechaValida = true;
                    }
                    break;
                case 4: // Abril
                case 6: // Junio
                case 9: // Septiembre
                case 11: // Noviembre
                    if (dia >= 1 && dia <= 30) {
                        fechaValida = true;
                    }
                    break;
                case 2: // Febrero
                    if (esBisiesto) {
                        if (dia >= 1 && dia <= 29) {
                            fechaValida = true;
                        }
                    } else {
                        if (dia >= 1 && dia <= 28) {
                            fechaValida = true;
                        }
                    }
                    break;
            }
            
            if (fechaValida) {
                System.out.println("La fecha es válida.");
            } else {
                System.out.println("La fecha no es válida.");
            }
        }
        
        scanner.close();
    }
}
