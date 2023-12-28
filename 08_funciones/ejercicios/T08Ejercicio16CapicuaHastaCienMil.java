/*
 * Muestra los números capicúa que hay entre 1 y 99999 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio16CapicuaHastaCienMil {
    public static void main(String[] args) {
        capisHastaCienMil();
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

    /**
     * funcion para devolver todos los capicuas hasta el numero 100000
     */
    public static void capisHastaCienMil() {
        for (int i = 1; i < 99999; i++) {
            if (esCapicua(i)) {
                System.out.print(i + " - ");
            }
        }
    }

}
