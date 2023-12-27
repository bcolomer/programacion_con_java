/*
 * digitoN: Devuelve el dígito que está en la posición n de un número entero.
Se empieza contando por el 0 y de izquierda a derecha. 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio07DigitoPosicion {
    public static void main(String[] args) {
        long numero = 12345678;
        int posicion = 3;
        System.out.println(digitoPosicion(posicion, numero));

    }

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

    public static int digitoPosicion(int posicion, long numero) {

        long volteado = voltea(numero);
        long reves = 0;
        long modulo = 0;
        int contador = 0;

        do {
            modulo = volteado % 10;
            volteado = volteado / 10;
            reves = (reves * 10) + modulo;
            contador++;

        } while (contador - 1 != posicion);
        return contador;
    }

}
