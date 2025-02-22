package estructurasdecnt;

/**
 *
 * @author IsaGc
 */
//Realizar un programa que transforme todas las letras del alfabeto de mayúsculas a minúsculas. minúsculas
public class Ejercicio1 {
   public static void main(String[] args){
       String[] abecedario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for(int i = 0; i < abecedario.length; i++){
            System.out.println(abecedario[i].toUpperCase());
        }
   } 

 
    
}
