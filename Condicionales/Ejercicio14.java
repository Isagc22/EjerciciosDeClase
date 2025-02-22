// El dueño de una papelería desea un programa que le indique el precio de venta de un artículo dado. El precio se
// calcula de acuerdo con la siguiente fórmula: PVP = precio_coste + ganancia. Donde la ganancia será:
// • El 15% si el precio de coste es inferior Bs. 3.
// • 50 céntimos si el precio de coste está entre Bs. 3 y Bs. 6.
// • El 25% si el precio de coste supera los Bs. 6. 


import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el precio de coste al usuario
        System.out.print("Ingrese el precio de coste del artículo (en Bs): ");
        double precioCoste = scanner.nextDouble();
        
        // Variable para la ganancia
        double ganancia = 0.0;
        
        // Determinar la ganancia según el precio de coste
        if (precioCoste < 3) {
            ganancia = precioCoste * 0.15; // 15% si el precio es menor a 3
        } else if (precioCoste >= 3 && precioCoste <= 6) {
            ganancia = 0.50; // 50 céntimos si el precio está entre 3 y 6
        } else if (precioCoste > 6) {
            ganancia = precioCoste * 0.25; // 25% si el precio es mayor a 6
        }
        
        // Calcular el precio de venta (PVP)
        double pvp = precioCoste + ganancia;
        
        // Mostrar el resultado
        System.out.printf("El precio de venta del artículo es: %.2f Bs\n", pvp);
        
        scanner.close();
    }
}
