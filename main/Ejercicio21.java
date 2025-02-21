// Determinar si un alumno aprueba a reprueba un curso, sabiendo que aprobara si su promedio de tres
// calificaciones es mayor o igual a 70; reprueba en caso contrario. 


import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las tres calificaciones
        System.out.print("Ingrese la primera calificación: ");
        double calificacion1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera calificación: ");
        double calificacion3 = scanner.nextDouble();

        // Calcular el promedio
        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        // Determinar si el alumno aprueba o reprueba
        if (promedio >= 70) {
            System.out.println("El alumno aprueba el curso.");
        } else {
            System.out.println("El alumno reprueba el curso.");
        }

        scanner.close();
    }
}
