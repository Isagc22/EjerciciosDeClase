// Calcular el mayor de cuatro números enteros introducidos por teclado. 

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa un segundo número: ");
        int numero2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa un tercer número: ");
        int numero3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa un cuarto número: ");
        int numero4 = scanner.nextInt();


      
        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4) {
            System.err.println("El numero: " + numero1 + " es el mayor");
        } else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4) {
            System.err.println("El numero: " + numero2 + " es el mayor");
        } else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4) {
            System.err.println("El numero: " + numero3 + " es el mayor");
        }else if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3) {
            System.err.println("El numero: " + numero4 + " es el mayor");
        }
         else {
            System.err.println("Todos son iguales :V");
        }
        scanner.close();
    }
}
