// Pedir un mes (número) y mostrar el nombre del mes. 

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un mes: ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
                System.out.println("El mes es ENERO");
                break;
            case 2:
                System.out.println("El mes es FEBRERO");
                break;
            case 3:
                System.out.println("El mes es MARZO");
                break;
            case 4:
                System.out.println("El mes es ABRIL");
                break;
            case 5:
                System.out.println("El mes es MAYO");
                break;
            case 6:
                System.out.println("El mes es JUNIO");
                break;
            case 7:
                System.out.println("El mes es JULIO");
                break;
            case 8:
                System.out.println("El mes es AGOSTO");
                break;
            case 9:
                System.out.println("El mes es SEPTIEMBRE");
                break;
            case 10:
                System.out.println("El mes es OCTUBRE");
                break;
            case 11:
                System.out.println("El mes es NOVIEMBRE");
                break;
            case 12:
                System.out.println("El mes es DICIEMBRE");
                break;
            default:
                System.out.println("Ese mes no existe");
        }
        scanner.close();
    }
}
