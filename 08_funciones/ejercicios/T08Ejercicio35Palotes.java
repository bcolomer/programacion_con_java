
/*
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una
cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
| - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
para comprobar que funciona bien. Desde la función no se debe mostrar nada
por pantalla, solo se debe usar print desde el programa principal. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T08Ejercicio35Palotes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long numero = 0;

        System.out.println("Introduzca un numero para la conversion a palotes:");
        numero = s.nextLong();
        s.close();

        numero = voltea(numero);

        System.out.printf("el %d es el %s en el sistema de palotes", numero, conversorAPalotes(numero));
    }

    /**
     * funcion para darle la vuelta a un numero
     * 
     * @param numero
     * @return
     */
    public static long voltea(long numero) {
        long reves = 0;
        long modulo = 0;
        do {
            modulo = numero % 10;
            numero = numero / 10;
            reves = (reves * 10) + modulo;
        } while (numero > 0);

        return reves;
    }

    /**
     * funcion para convertir un numero a palotes
     * 
     * @param numero
     * @return
     */
    public static String conversorAPalotes(long numero) {
        long modulo = 0;
        String palotes = "";

        while (numero > 0) {
            modulo = numero % 10;
            numero = numero / 10;
            for (int i = 0; i < modulo; i++) {
                palotes += "|";
            }
            if (numero > 0) {
                palotes += " - ";
            }
        }
        return palotes;
    }

}
