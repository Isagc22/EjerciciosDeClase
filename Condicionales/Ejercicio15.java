// Una empresa de préstamos decidió cambiar su esquema de cobros así:
// • Si el préstamo es de más de 5000 euros, cobra en tres cuotas
// • Si el préstamo es de menos de 1000 euros, cobra en una cuota
// • Si el préstamo es entre 2000 y 3000 euros cobra en dos cuotas
// • En los demás casos cobra en cinco cuotas
// Adicionalmente, si es de menos de 4000 euros cobra el 12% de interés, en caso contrario cobra el 10% de interés.
// El programa debe decir en cuántas cuotas debe pagar y de cuánto es cada cuota. Para ello, se calcula el valor
// total de la deuda con interés y se divide en cuotas iguales. 

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el monto del préstamo al usuario
        System.out.print("Ingrese el monto del préstamo (en euros): ");
        double montoPrestamo = scanner.nextDouble();

        // Variable para el número de cuotas y el interés
        int cuotas = 0;
        double interes = 0.0;

        // Determinar el número de cuotas
        if (montoPrestamo > 5000) {
            cuotas = 3; // Préstamo mayor a 5000 euros, 3 cuotas
        } else if (montoPrestamo < 1000) {
            cuotas = 1; // Préstamo menor a 1000 euros, 1 cuota
        } else if (montoPrestamo >= 2000 && montoPrestamo <= 3000) {
            cuotas = 2; // Préstamo entre 2000 y 3000 euros, 2 cuotas
        } else {
            cuotas = 5; // Otros casos, 5 cuotas
        }

        // Determinar el interés
        if (montoPrestamo < 4000) {
            interes = 0.12; // 12% de interés si el préstamo es menor a 4000 euros
        } else {
            interes = 0.10; // 10% de interés si el préstamo es mayor o igual a 4000 euros
        }

        // Calcular el total con el interés
        double totalConInteres = montoPrestamo + (montoPrestamo * interes);

        // Calcular el valor de cada cuota
        double cuota = totalConInteres / cuotas;

        // Mostrar el resultado
        System.out.printf("El préstamo se debe pagar en %d cuotas.\n", cuotas);
        System.out.printf("El monto de cada cuota es: %.2f euros.\n", cuota);

        scanner.close();
    }
}
