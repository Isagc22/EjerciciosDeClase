
import java.util.Scanner;

/**
 *
 * @author Est01
 */
//Programa que lee las edades de un grupo de 100 alumnos y encuentra el promedio. 
public class Ejercicio2 {

    public static void main(String[] args) {

        int limite = 4;
        int cont = 1;
        int sumaEdad = 0;
        int edad = 0;
        while (cont <= limite) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Dime tu edad: ");
            edad = scanner.nextInt();
            cont++;
            sumaEdad += edad;
        }
        int promedio = sumaEdad / limite;

        System.out.println("El promedio es: " + promedio);
    }
}
