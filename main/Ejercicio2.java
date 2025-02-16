
import java.util.Scanner;

/**
 * @description: Clase principal del programa
 * @author: Isagc
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero = scanner.nextInt();
        // scanner.nextLine();

        if (numero >= 0) {
            System.out.println("El numero es positivo");
        } else {
            System.err.println("El numero es negativo");
        }
        scanner.close();

    }

}
