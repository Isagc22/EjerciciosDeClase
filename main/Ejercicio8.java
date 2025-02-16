// Un año es bisiesto si es divisible por 4 y no es por 100, o si es divisible por 400. Escribe un programa que lea un
// año y devuelva si es bisiesto o no. 

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el año: ");
        int year = scanner.nextInt();

        if(year % 400 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año no es bisiesto");
        }

        scanner.close();
    }    
}
