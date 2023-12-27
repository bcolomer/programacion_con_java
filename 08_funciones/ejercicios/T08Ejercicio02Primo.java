/*
 * esPrimo: Devuelve verdadero si el número que se pasa como parámetro
es primo y falso en caso contrario. 
 * 
 * @autor Barbara Colomer
 */

public class T08Ejercicio02Primo {
    public static void main(String[] args) {
        long numero = 13;

        System.out.println(esPrimo(numero));
    }

    /**
     * Comprueba si un número es o no primo
     * 
     * @param int numero
     * @return boolean
     */
    public static boolean esPrimo(long numero) {

        boolean primo = true;
        if (numero > 2) {

            for (int i = 2; i < (numero / 2); i++) {
                if (numero % i == 0) {
                    primo = false;
                }

            }
        }

        return (primo);
    }
}
