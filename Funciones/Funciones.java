
import java.util.Scanner;

/**
 *
 * @author IsaGc
 */
public class Funciones {

    // Funciones:
    public static double saldo = 2000;

    public static double consultaSaldo() {
        return saldo;
    }

    public static void retirarSaldo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuanto quieres retirar: ");
        int cantidad = scanner.nextInt();

        if (cantidad > saldo) {
            System.out.println("No tienes saldo suficiente.. :(");
        } else {
            System.out.println("Retirando..");
            System.out.println("Retiro exitoso, tu nuevo saldo es: " + (saldo - cantidad));
        }
        return;
    }

    public static void consignarSaldo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuanto quieres consignar: ");
        int consignacion = scanner.nextInt();

        System.out.println("Consignando.....");
        System.out.println("Consignación existosa");
        System.out.println("Tu nuevo saldo es: " + (saldo + consignacion));
        return;

    }

    public static void main(String[] args) {
        String usuario = "Isabela";
        while (true) {
            System.out.println("\n Hola Usuario " + usuario + "\n");
            System.out.println("¿Que quieres hacer el dia de hoy? \n");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Hacer Retiros");
            System.out.println("3. Hacer Consignacion");
            System.out.println("4. Salir");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    double saldo = consultaSaldo();
                    System.out.println("Consultando Saldo ...\n");
                    System.out.println(saldo);
                    break;
                case 2:
                    retirarSaldo();

                    break;
                case 3:
                    consignarSaldo();
                    break;
                default:
                    break;
            }
        }

    }
}
