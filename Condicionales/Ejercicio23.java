// La fecha del domingo de Pascua corresponde al primer domingo después de la primera luna llena que sigue al
// equinoccio de primavera. Dado un año, los cálculos que permiten conocer esta fecha son:
// • A = año %19
// • B = año % 4
// • C = año % 7
// • D = (19 * A + 24) % 30
// • E = (2 * B + 4 * C + 6 * D + 5) % 7
// • N = (22 + D + E)
// Donde N indica el número del día del mes de marzo (o abril si N es superior a 31) correspondiente al domingo de
// Pascua. Escribir un programa que lea un año y muestre el día y el mes en el que se celebró o se celebrará el
// domingo de Pascua ese año. Utilizar una función a la que se le pase como parámetro el año y retorne el valor de
// N. El programa principal realiza el resto del proceso. 

import java.util.Scanner;

public class DomingoDePascua {

    // Función para calcular N (el día del mes de Pascua)
    public static int calcularDiaPascua(int año) {
        int A = año % 19;
        int B = año % 4;
        int C = año % 7;
        int D = (19 * A + 24) % 30;
        int E = (2 * B + 4 * C + 6 * D + 5) % 7;
        return 22 + D + E;  // Esto nos da el valor de N
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el año al usuario
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();

        // Calcular el día del Domingo de Pascua
        int N = calcularDiaPascua(año);

        // Determinar el mes y día
        if (N > 31) {
            // Si N es mayor a 31, la Pascua es en abril
            System.out.println("El Domingo de Pascua en " + año + " es el " + (N - 31) + " de abril.");
        } else {
            // Si N es menor o igual a 31, la Pascua es en marzo
            System.out.println("El Domingo de Pascua en " + año + " es el " + N + " de marzo.");
        }

        scanner.close();
    }
}
