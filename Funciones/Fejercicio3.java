
import java.util.Scanner;

/**
 *
 * @author Est01
 */
//Crear una función llamada "letraRepetida", que reciba como parámetros una letra y un número, y escriba en
//pantalla esa letra repetida en pantalla varias veces (tantas como indique el número), sin devolver ningún valor. 
public class Fejercicio3 {

    public static void letraRepetida(int num, char letra) {
        for (int i = 0; i < num; i++) {
            System.out.println(letra);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int num = scanner.nextInt();
        System.out.println("Dame una letra: ");
        char letra = scanner.next().charAt(0);

        System.out.print("La letra repetida es:\n ");
        letraRepetida(num, letra);  // Ahora no necesitas concatenar el valor de retorno, solo llamar a la función
    }
}
