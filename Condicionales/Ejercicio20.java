// Construir un programa que calcule y presente por pantalla el signo del zodiaco a partir de la introducción por
// teclado del día y mes de nacimiento como números enteros

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el día y mes de nacimiento
        System.out.print("Ingrese el día de su nacimiento: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes de su nacimiento (1-12): ");
        int mes = scanner.nextInt();

        // Determinar el signo del zodiaco
        String signo = "";

        if (mes == 12) {
            if (dia >= 22) {
                signo = "Capricornio";
            } else {
                signo = "Sagitario";
            }
        } else if (mes == 1) {
            if (dia <= 20) {
                signo = "Capricornio";
            } else {
                signo = "Acuario";
            }
        } else if (mes == 2) {
            if (dia <= 19) {
                signo = "Acuario";
            } else {
                signo = "Piscis";
            }
        } else if (mes == 3) {
            if (dia <= 20) {
                signo = "Piscis";
            } else {
                signo = "Aries";
            }
        } else if (mes == 4) {
            if (dia <= 20) {
                signo = "Aries";
            } else {
                signo = "Tauro";
            }
        } else if (mes == 5) {
            if (dia <= 20) {
                signo = "Tauro";
            } else {
                signo = "Géminis";
            }
        } else if (mes == 6) {
            if (dia <= 21) {
                signo = "Géminis";
            } else {
                signo = "Cáncer";
            }
        } else if (mes == 7) {
            if (dia <= 21) {
                signo = "Cáncer";
            } else {
                signo = "Leo";
            }
        } else if (mes == 8) {
            if (dia <= 21) {
                signo = "Leo";
            } else {
                signo = "Virgo";
            }
        } else if (mes == 9) {
            if (dia <= 22) {
                signo = "Virgo";
            } else {
                signo = "Libra";
            }
        } else if (mes == 10) {
            if (dia <= 22) {
                signo = "Libra";
            } else {
                signo = "Escorpio";
            }
        } else if (mes == 11) {
            if (dia <= 21) {
                signo = "Escorpio";
            } else {
                signo = "Sagitario";
            }
        }

        // Mostrar el signo
        System.out.println("Su signo del zodiaco es: " + signo);

        scanner.close();
    }
}
