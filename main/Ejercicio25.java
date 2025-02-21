// Realizar un programa que solicite dos números enteros, los ordene en forma ascendente y los imprima.

import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dos números enteros
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        // Ordenar los números en forma ascendente
        if (num1 > num2) {
            // Si el primer número es mayor que el segundo, intercambiamos los valores
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Imprimir los números ordenados
        System.out.println("Los números en orden ascendente son: " + num1 + ", " + num2);

        // Cerrar el scanner
        scanner.close();
    }
}
