// Solicitar al usuario la inicial del día de la semana y mostrar el nombre del día completo. La letra inicial puede ser
// mayúscula o minúscula. Usar la x para el miércoles

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime la letra inicial del día: ");
        String dia = scanner.next();

        switch (dia.toUpperCase()) {
            case "L":
                System.err.println("El día es LUNES");
                break;
            case "M":
                System.err.println("El día es MARTES");
                break;
            case "X":
                System.err.println("El día es MIERCOLES");
                break;
            case "J":
                System.err.println("El día es JUEVES");
                break;
            case "V":
                System.err.println("El día es VIERNES");
                break;
            case "S":
                System.err.println("El día es SABADO");
                break;
            case "D":
                System.err.println("El día es DOMINGO");
                break;
            default:
                System.err.println("Ese día no existe");
        }

        scanner.close();
    }
}
