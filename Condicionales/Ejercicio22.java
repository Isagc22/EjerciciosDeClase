// En un almacén se hace un 20% de descuento a los clientes cuya compra supere los Bs. 1.000 ¿Cual será la
// cantidad que pagará una persona por su compra? 


import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor ingresa el valor de tu compra: ");
        double valorCompra = scanner.nextDouble();  

        if (valorCompra > 1000) {
            
            double valorTotal = valorCompra - (valorCompra * 0.20);  
            System.out.println("Tu compra tiene un descuento del 20%, por lo cual te queda en: " + valorTotal);
        } else {
            System.out.println("Gracias por tu compra, el valor es: " + valorCompra);
        }
        
        scanner.close();
    }
}
