/*
 * Esta función convierte el número n al sistema Morse y lo devuelve en una
cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
Morse. Utiliza esta función en un programa para comprobar que funciona bien.
Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
desde el programa principal. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T08Ejercicio37morse {
    public static void main(String[] args) {
        long numero = 0;
        long numeroDerecho = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero para convertirlo a codigo Morse.");
        numero = s.nextLong();
        s.close();
        numeroDerecho = numero;
        numero = voltea(numero);

        System.out.printf("el numero %d es el %s en Morse", numeroDerecho, convierteMorse(numero));
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
     * funcion para convertir un numero a codigo morse
     * 
     * @param numero
     * @return
     */
    public static String convierteMorse(long numero) {
        String morse = "";
        int modulo = 0;
        do {
            modulo = (int) numero % 10;
            numero = numero / 10;
            switch (modulo) {
                case 1:
                    morse += ".----";
                    break;
                case 2:
                    morse += "..---";
                    break;
                case 3:
                    morse += "...--";
                    break;
                case 4:
                    morse += "....-";
                    break;
                case 5:
                    morse += ".....";
                    break;
                case 6:
                    morse += "-....";
                    break;
                case 7:
                    morse += "--...";
                    break;
                case 8:
                    morse += "---..";
                    break;
                case 9:
                    morse += "----.";
                    break;
                default:
                    morse += "-----";
                    break;
            }
        } while (numero > 0);

        return morse;
    }
}
