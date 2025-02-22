import java.util.Scanner;

/**
 *
 * @author Est01
 */
//Leer 10 números e imprimir solamente los números positivos. 
public class Ejercicio5 {

    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, -5};

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                System.out.println("Soy positivo " + array[i]);
            }
        }
    }
}
