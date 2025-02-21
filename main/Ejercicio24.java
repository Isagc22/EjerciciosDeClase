// Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
// • Si trabaja 40 horas o menos se le paga Bs. 16 por hora.
// • Si trabaja más de 40 horas se le paga Bs. 16 por cada una de las primeras 40 horas y Bs. 20 por cada hora
// extra.

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de horas trabajadas
        System.out.println("Ingresa tus horas de trabajo: ");
        int horasTrabajadas = scanner.nextInt();

        double salario;

        // Si el obrero trabajó 40 horas o menos, se le paga Bs. 16 por hora
        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * 16;
        } else {
            // Si el obrero trabajó más de 40 horas, se le paga Bs. 16 por las primeras 40 horas
            // y Bs. 20 por cada hora extra
            int horasExtras = horasTrabajadas - 40;
            salario = (40 * 16) + (horasExtras * 20);
        }

        // Mostrar el salario calculado
        System.out.println("El salario semanal es: Bs. " + salario);

        // Cerrar el scanner
        scanner.close();
    }
}
