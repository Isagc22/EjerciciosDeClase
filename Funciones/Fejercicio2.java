
import java.util.Scanner;

/**
 *
 * @author IsaGc
 */
//Crear una función llamada "division", que reciba como parámetros dos números enteros y devuelva como
//resultado un número real, que sea el resultado de dividir el primer número entre el segundo (con decimales)
public class Fejercicio2 {

    public static double division(int num1, int num2) {
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Dame un segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("La divison es: " + division(num1, num2));
    }
}
