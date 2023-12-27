/*
 * siguientePrimo: Devuelve el menor primo que es mayor al número que
se pasa como parámetro. 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio03SiguientePrimo {
    public static void main(String[] args) {

        long numero = 14;

        System.out.println(siguientePrimo(numero));

    }

    public static boolean esPrimo(long numero) {

        boolean primo = true;
        if (numero > 2) {

            for (int i = 2; i < (numero / 2); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }

            }
        }

        return (primo);
    }

    public static long siguientePrimo(long numero) {
        long sigPrimo = numero;
        boolean esSigPrimo = false;
        do {
            sigPrimo++;
            esSigPrimo = esPrimo(sigPrimo);

        } while (!esSigPrimo);

        return sigPrimo;
    }
}
