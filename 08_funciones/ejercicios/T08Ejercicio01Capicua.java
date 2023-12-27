/*
 * esCapicua: Devuelve verdadero si el número que se pasa como parámetro
es capicúa y falso en caso contrario. 
 * 
 * @autor Barbara Colomer
 */

public class T08Ejercicio01Capicua {
    public static void main(String[] args) {
        long numero = 7887;

        System.out.println(esCapicua(numero));

    }

    /**
     * funcion para comprobar si un numero es capicua
     * 
     * @param numero
     * @return
     */
    public static boolean esCapicua(long numero) {

        boolean esCapi = true;
        long modulo = 0;
        long invertido = 0;
        long copiaNumero = numero;

        do {
            modulo = numero % 10;
            numero = numero / 10;
            invertido = (invertido * 10) + modulo;

        } while (numero > 0);

        if (invertido != copiaNumero) {
            esCapi = false;
        }

        return esCapi;
    }
}
