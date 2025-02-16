package main;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa otro número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El numero: " + numero1 + " es mayor");
        } else if (numero2 > numero1) {
            System.out.println("El numero: " + numero2 + " es mayor");
        } else {
            System.err.println("Ambos numeros son iguales");
        }
        scanner.close();

    }

}
