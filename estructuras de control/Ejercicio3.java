
import java.util.Scanner;

/**
 *
 * @author Isagc
 */
// Calcular el promedio de un alumno que tiene 7 calificaciones en la materia de Cálculo. 
public class Ejercicio3 {

    public static void main(String[] args) {
        int limite = 7;
        int cont = 1;
        int calificaciones = 0;
        int sumaCali = 0;
        while (cont <= limite) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Dime tu calificación: ");
            calificaciones = scanner.nextInt();
            cont++;
            sumaCali += calificaciones;
        }
        int promedio = sumaCali / limite;

        System.out.println("El promedio es: " + promedio);

    }
}
