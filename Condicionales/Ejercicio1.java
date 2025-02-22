package main;

//importar clases
import java.util.Scanner;

/**
 * @description: Clase principal del programa
 * @author: Isagc
 */
//Iniciar creación de clase, esta debe ser con mayuscula y el documento llamarse igual
public class Ejercicio1 {

    /**
     * @param args Tendremos una clase vacia
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
       

        if (numero % 2 == 0) {
            System.out.println("El numero si es par");
        } else {
            System.out.println("El numero no es par");
        }
        scanner.close();
    }
}
