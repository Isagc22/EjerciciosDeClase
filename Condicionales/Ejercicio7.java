// Determinar en que estado está el agua en función de su temperatura. Si es negativa el estado será sólido, si es
// menor que 100 será líquido y si es mayor que 100 será gas. Pedir al usuario el valor de la temperatura. 

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el valor de la temperatura: ");
        int numero1 = scanner.nextInt();

        if (numero1 < 0) {
            System.out.println("El estado del agua es SOLIDO");
        } else if (numero1 <= 100) {
            System.err.println("El estado del agua es LIQUIDO");
        } else {
            System.err.println("El estado del agua es GAS");
        }

        scanner.close();
    }
}
