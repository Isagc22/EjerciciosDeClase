
import java.util.Scanner;

/**
 *
 * @author Est01
 */
//Crear una función llamada "suma", que reciba como parámetros dos números enteros y devuelva como resultado
//otro número entero que sea la suma de ambos. 
public class Fejercicio1 {

    public static int suma(int num1, int num2) {
        return num1 + num2;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Dame un segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("La suma es: " + suma(num1, num2));
    }

}
