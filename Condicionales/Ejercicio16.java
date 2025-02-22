// Calcular el salario neto de un trabajador de una empresa cuyo trabajo se paga por horas. Introducir por teclado el
// número de horas y el precio de la hora. El cálculo se realiza del siguiente modo:
// • Las primeras 35 horas de cada semana se pagan a la tarifa normal (suponer 4 semanas al mes).
// • Las horas extras se pagan un 50% más que las normales.
// • Los impuestos a deducir a los trabajadores varían en función de su sueldo mensual (considerando las horas
// extras trabajadas):
// o Si el sueldo es menor de € 600, libre de impuestos.
// o Si el sueldo está entre € 600 y € 1000, los impuestos son el 20%.
// o Si el sueldo es mayor de € 1000, el 30%. 


import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número de horas trabajadas y precio por hora
        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        double horasTrabajadas = scanner.nextDouble();
        
        System.out.print("Ingrese el precio por hora (€): ");
        double precioHora = scanner.nextDouble();

        // Calcular horas normales y horas extras
        double horasNormales = Math.min(horasTrabajadas, 35); // Se pagan las primeras 35 horas a tarifa normal
        double horasExtras = Math.max(0, horasTrabajadas - 35); // Las horas adicionales a 35 son horas extras

        // Calcular el salario bruto
        double salarioBruto = (horasNormales * precioHora) + (horasExtras * precioHora * 1.5);

        // Calcular el salario mensual
        double salarioMensual = salarioBruto * 4; // 4 semanas por mes

        // Calcular los impuestos según el salario mensual
        double impuestos = 0;
        if (salarioMensual >= 600 && salarioMensual <= 1000) {
            impuestos = salarioMensual * 0.20; // 20% de impuestos
        } else if (salarioMensual > 1000) {
            impuestos = salarioMensual * 0.30; // 30% de impuestos
        }

        // Calcular el salario neto
        double salarioNeto = salarioMensual - impuestos;

        // Mostrar los resultados
        System.out.printf("El salario bruto mensual es: %.2f €\n", salarioMensual);
        System.out.printf("Los impuestos son: %.2f €\n", impuestos);
        System.out.printf("El salario neto mensual es: %.2f €\n", salarioNeto);

        scanner.close();
    }
}
