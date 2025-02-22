
import java.util.Scanner;

/**
 *
 * @author Isagc
 */
//Leer 10 números y obtener su cubo y su cuarta.
public class Ejercicio4 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int cubo = 0;
        int cuarta = 4;
        for (int i = 0; i < array.length; i++) {
            cubo = array[i];
            System.out.println("Soy el cubo de: " + array[i]);
            System.out.println(array[i] * cubo);

            System.out.println("----------------------------");
            System.out.println("Soy la cuarta de: " + array[i]);
            System.out.println(array[i] / cuarta);

        }

    }
}
