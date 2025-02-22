// La Dirección General de Tráfico necesita un programa que mida el índice alcohólico; dado el tipo de vehículo que
// conduce un conductor, determine si da positivo en el control de alcoholemia o no. La tasa máxima de alcohol
// según el tipo de vehículo se resume en la siguiente tabla:
// Vehículo Indicador Tasa máxima

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tipo de vehículo y la tasa de alcohol
        System.out.print("Ingrese el tipo de vehículo (C para Camión, A para Autobús, T para Turismo, M para Motocicleta): ");
        char tipoVehiculo = scanner.next().charAt(0);  // Leer el tipo de vehículo (carácter)

        System.out.print("Ingrese la tasa de alcohol del conductor: ");
        double tasaAlcohol = scanner.nextDouble();  // Leer la tasa de alcohol

        // Determinar la tasa máxima permitida según el tipo de vehículo
        double tasaMaxima = 0.0;

        switch (tipoVehiculo) {
            case 'C': // Camión
            case 'A': // Autobús
            case 'M': // Motocicleta
                tasaMaxima = 0.3;
                break;
            case 'T': // Turismo
                tasaMaxima = 0.5;
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                return; // Salir si el tipo de vehículo no es válido
        }

        // Comprobar si la tasa de alcohol es superior a la permitida
        if (tasaAlcohol > tasaMaxima) {
            System.out.println("¡El conductor da positivo en el control de alcoholemia!");
        } else {
            System.out.println("El conductor no da positivo en el control de alcoholemia.");
        }

        scanner.close();
    }
}
