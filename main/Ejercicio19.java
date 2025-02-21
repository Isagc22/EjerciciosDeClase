// La compañía que gestiona la autopista ha decidido cambiar las tarifas de peaje.
// Estas tarifas dependen del tipo de vehículo (camión o automóvil) que desee utilizar la autopista, del número de
// pasajeros que lleve y de la hora del día: en las horas de alta congestión los automóviles con tres pasajeros o más
// no pagan peaje, los camiones pagan 50 euros; en las horas menos congestionadas el peaje para los automóviles
// es de 25 euros y para los camiones es de 30 euros independientemente del número de pasajeros.
// Escriba un programa que leyendo el tipo de vehículo, tipo de hora (si la hora es de alta congestión o no) y el
// número de pasajeros, calcule la tarifa que le debe cobrar a un vehículo. 

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tipo de vehículo
        System.out.print("Ingrese el tipo de vehículo (A para automóvil, C para camión): ");
        char tipoVehiculo = scanner.next().charAt(0);  // Leer el tipo de vehículo

        // Solicitar la hora (alta congestión o no)
        System.out.print("Ingrese la hora del día (1 para alta congestión, 2 para menos congestión): ");
        int hora = scanner.nextInt();  // Leer la hora (1 o 2)

        // Solicitar el número de pasajeros (solo si el vehículo es automóvil)
        int numPasajeros = 0;
        if (tipoVehiculo == 'A' || tipoVehiculo == 'a') {
            System.out.print("Ingrese el número de pasajeros: ");
            numPasajeros = scanner.nextInt();
        }

        // Calcular la tarifa
        double tarifa = 0.0;

        if (hora == 1) {  // Alta congestión
            if (tipoVehiculo == 'A' || tipoVehiculo == 'a') {
                if (numPasajeros >= 3) {
                    tarifa = 0.0;  // Los automóviles con 3 o más pasajeros no pagan peaje
                } else {
                    tarifa = 25.0;  // Automóviles sin 3 o más pasajeros pagan 25 euros
                }
            } else if (tipoVehiculo == 'C' || tipoVehiculo == 'c') {
                tarifa = 50.0;  // Los camiones pagan 50 euros
            }
        } else if (hora == 2) {  // Menos congestión
            if (tipoVehiculo == 'A' || tipoVehiculo == 'a') {
                tarifa = 25.0;  // Los automóviles pagan 25 euros
            } else if (tipoVehiculo == 'C' || tipoVehiculo == 'c') {
                tarifa = 30.0;  // Los camiones pagan 30 euros
            }
        } else {
            System.out.println("Hora no válida. Debe ser 1 para alta congestión o 2 para menos congestión.");
            scanner.close();
            return;
        }

        // Mostrar el resultado
        System.out.printf("La tarifa de peaje es: %.2f euros\n", tarifa);

        scanner.close();
    }
}
