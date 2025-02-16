// Pedir al usuario un valor. Si el valor es positivo, pedir un segundo valor y calcular la suma, resta y producto de
// ambos. Mostrar los resultados por pantalla. 

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero1 = scanner.nextInt();

        if (numero1 > 0) {

            System.out.println("Ingresa otro número: ");
            int numero2 = scanner.nextInt();

            int Suma = numero1 + numero2;
            int Resta = numero1 - numero2;
            int Multiplicacion = numero1 * numero2;
            // int Producto = numero1 % numero2;

            System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + Suma);
            System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + Resta);
            System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es: " + Multiplicacion);
            // System.out.println("El producto de " + numero1 + " y " + numero2 + " es: " + Producto);

        } else {
            System.out.println("Gracias por participar");
        }
        scanner.close();

    }

}
