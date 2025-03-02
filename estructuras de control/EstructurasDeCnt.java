
/**
 *
 * @author IsaGc
 */
public class EstructurasDeCnt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // For es para elementos que se puedan recorrer 
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i : array) {
            System.out.println("Soy el número: " + i);
        }
        System.out.println("Fin del for");

        // Do while
        int iterador = 0;
        do {
            System.out.println("El número es: " + iterador);
            iterador++;
        } while (iterador <= 10);
        System.out.println("Fin del Do While");

        //While
        int j = 9;
        while (j >= 0) {
            System.out.println("El número es: " + j);
            j--;
        }
        System.out.println("Fin del while");

    }
}
